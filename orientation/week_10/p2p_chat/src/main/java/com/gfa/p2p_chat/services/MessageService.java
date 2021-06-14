package com.gfa.p2p_chat.services;

import com.gfa.p2p_chat.models.Message;
import com.gfa.p2p_chat.models.MessageDTO;
import com.gfa.p2p_chat.repositories.MessageRepository;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

  private MessageRepository messageRepository;
  ModelMapper modelMapper = new ModelMapper();
  Message lastMessage = new Message();

  @Autowired
  public MessageService(MessageRepository messageRepository) {
    this.messageRepository = messageRepository;
  }

  public void saveNewMessage(MessageDTO messageDTO) {
    Instant instant = Instant.now();
    Message message = new Message();

    message.setUsername(messageDTO.getUsername());
    message.setText(messageDTO.getText());
    message.setId(generateRandomId());
    message.setTimestamp(instant.getEpochSecond());

    lastMessage = message;
    messageRepository.save(message);
  }

  public void saveReceivedMessage(Message message) {
    messageRepository.save(message);
    lastMessage = message;
  }

  public Message getLastMessage() {
    return lastMessage;
  }

  private int generateRandomId() {
    Random random = new Random();
    int id;
    do {
      id = 1000000 + random.nextInt(9000000);
    } while (messageRepository.existsById(id));
    return id;
  }

  public List<MessageDTO> getAllMessageDTO() {
    return messageRepository.findAll()
        .stream()
        .map(x -> modelMapper.map(x, MessageDTO.class))
        .collect(Collectors.toList());
  }
}
