package com.gfa.p2p_chat.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

  public String username;
}
