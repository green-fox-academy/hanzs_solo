package com.gfa.reddit_project;

import com.gfa.reddit_project.models.Post;
import com.gfa.reddit_project.models.User;
import com.gfa.reddit_project.repositories.PostRepository;
import com.gfa.reddit_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditProjectApplication implements CommandLineRunner {

  PostRepository postRepository;
  UserRepository userRepository;

  @Autowired
  public RedditProjectApplication(PostRepository postRepository,
      UserRepository userRepository) {
    this.postRepository = postRepository;
    this.userRepository = userRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditProjectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    postRepository.save(
        new Post("anonymus", "post 1",
            "content content content content content content content content "));
    postRepository.save(
        new Post("anonymus", "post 2",
            "content content content content content content content content "));
    postRepository.save(
        new Post("anonymus", "post 3",
            "content content content content content content content content "));
    postRepository.save(
        new Post("anonymus", "post 4",
            "content content content content content content content content "));
    postRepository.save(
        new Post("anonymus", "post 5",
            "content content content content content content content content "));

    userRepository.save(new User("admin", "admin"));
  }
}
