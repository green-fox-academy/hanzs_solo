package com.gfa.reddit_project.models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

  @Id
  @Column(columnDefinition = "VARCHAR(40)")
  private String username;
  private String password;
//  @OneToMany
//  private List<Post> posts;

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }
}
