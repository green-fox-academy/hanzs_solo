package com.gfa.p2p_chat.controllers;

import com.gfa.p2p_chat.models.Message;
import com.gfa.p2p_chat.models.MessageDTO;
import com.gfa.p2p_chat.services.MessageService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class DisplayController {

  MessageService messageService;
  RestTemplate restTemplate;

  @Autowired
  public DisplayController(MessageService messageService) {
    this.messageService = messageService;
    this.restTemplate = new RestTemplate();
  }

  @GetMapping("/register")
  public String displayRegisterPage() {
    return "register-page";
  }

  @PostMapping("/register")
  public String registerUser() {
    return "redirect:/";
  }

  @GetMapping("/")
  public String displayMainPage(Model model) {
    model.addAttribute("messages", messageService.getAllMessageDTO());
    return "main-page";
  }

  @PostMapping("/save-message")
  public String saveNewMessage(@ModelAttribute MessageDTO messageDTO) {
    messageService.saveNewMessage(messageDTO);
    //forwardMessage();
    return "redirect:/";
  }

  @PostMapping("/api/message/receive")
  @ResponseBody
  public ResponseEntity<?> receiveMessage(@RequestBody Message message) {
    messageService.saveReceivedMessage(message);
    //forwardMessage();
    return ResponseEntity.ok().build();
  }

  @ResponseBody
  private void forwardMessage() {
    HttpEntity<Message> httpEntity = new HttpEntity<>(messageService.getLastMessage());
    restTemplate.exchange("http://188.157.220.94/api/message/receive", HttpMethod.POST, httpEntity,
        Message.class);
  }
}
