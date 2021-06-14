package com.gfa.frontend.models.logs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "logs")
@Getter
@Setter
@NoArgsConstructor
public class Log {

  @Id
  @GeneratedValue
  @JsonIgnore
  long id;
  Date createdAt;
  String endpoint;
  String data;
}
