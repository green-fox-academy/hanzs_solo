package com.gfa.reddit_project.services;

import com.gfa.reddit_project.models.User;
import com.gfa.reddit_project.repositories.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterAndLoginService {

  private final UserRepository userRepository;

  @Autowired
  public RegisterAndLoginService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public boolean registerNewUser(String username, String password) {
    if (userRepository.existsUserByUsername(username)) {
      return false;
    }
    userRepository.save(new User(username, password));
    return true;
  }

  public String loginToAccount(String username, String password) {
    Optional<User> optionalUser = userRepository.getUserByUsernameAndPassword(username, password);
    return optionalUser.map(User::getUsername).orElse("");
  }
}
