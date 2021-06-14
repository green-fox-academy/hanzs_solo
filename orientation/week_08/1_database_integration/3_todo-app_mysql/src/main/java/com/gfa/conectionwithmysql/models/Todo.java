package com.gfa.conectionwithmysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "todo")
@NoArgsConstructor
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue
  private long id;

  private String title;
  private boolean urgent;
  private boolean done;

  public Todo(String title) {
    this(title, false, false);
  }

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }
}
