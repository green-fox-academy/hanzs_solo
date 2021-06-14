package com.gfa.p2p_chat.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="messages")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Message {

  @Id
  private int id;
  private String username;
  private String text;
  private long timestamp;
}
