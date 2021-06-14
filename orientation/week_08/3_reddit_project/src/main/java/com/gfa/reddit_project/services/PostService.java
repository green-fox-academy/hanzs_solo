package com.gfa.reddit_project.services;

import com.gfa.reddit_project.models.Post;
import com.gfa.reddit_project.repositories.PostRepository;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class PostService {

  private final PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> getAllPosts() {
    return postRepository.findAll();
  }

  public void saveNewPost(String username, String title, String content, MultipartFile file) {

    Post newPost = new Post(username, title, content);

    newPost.setImgPath(saveFile(file));

    postRepository.save(newPost);
  }

  private String saveFile(MultipartFile file) {
    String[] temp = file.getOriginalFilename().split("\\.");
    String fileExtension = "." + temp[temp.length - 1];
    String fileName = UUID.randomUUID() + fileExtension;

    Path dirPath = Paths.get("src/main/resources/templates/user-data/photos/");
    Path filePath = dirPath.resolve(fileName);

    try {
      Files.createDirectories(dirPath);
      file.transferTo(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return "/user-data/photos/" + fileName;
  }
}
