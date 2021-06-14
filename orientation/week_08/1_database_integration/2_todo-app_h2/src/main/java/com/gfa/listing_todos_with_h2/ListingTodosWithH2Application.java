package com.gfa.listing_todos_with_h2;

import com.gfa.listing_todos_with_h2.models.Todo;
import com.gfa.listing_todos_with_h2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodosWithH2Application implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public ListingTodosWithH2Application(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }


  public static void main(String[] args) {
    SpringApplication.run(ListingTodosWithH2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("hello"));
  }
}
