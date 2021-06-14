package com.gfa.p2p_chat.repositories;

import com.gfa.p2p_chat.models.Message;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
  @Override
  List<Message> findAll();
}
