package com.gfa.reddit_project.repositories;

import com.gfa.reddit_project.models.Post;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
  @Override
  List<Post> findAll();
}
