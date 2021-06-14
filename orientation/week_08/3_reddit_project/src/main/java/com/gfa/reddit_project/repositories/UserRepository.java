package com.gfa.reddit_project.repositories;

import com.gfa.reddit_project.models.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

  boolean existsUserByUsername(String username);

  Optional<User> getUserByUsernameAndPassword(String username, String password);
}
