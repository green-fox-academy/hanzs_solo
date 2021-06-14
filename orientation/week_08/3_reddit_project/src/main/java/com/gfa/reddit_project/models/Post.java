package com.gfa.reddit_project.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "posts")
@NoArgsConstructor
@Getter
@Setter
public class Post {

  @Id
  @GeneratedValue
  private long id;

  private String title;
  @Column(columnDefinition = "TEXT")
  private String content;
  private Date date;
  private int score;
  private String author;
  private String imgPath;
//  @ManyToOne()
//  private User user;

  public Post(String author, String title, String content) {
    this.author = author;
    this.title = title;
    this.content = content;
    date = new Date();
    score = 0;
  }
}
