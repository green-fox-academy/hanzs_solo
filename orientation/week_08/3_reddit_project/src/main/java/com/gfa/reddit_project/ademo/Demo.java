package com.gfa.reddit_project.ademo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class Demo {

//  @PostMapping("/upload")
//  public String uploadFile(@RequestParam("file") MultipartFile file,
//      @RequestParam String greeting) {
//
//    System.out.println(greeting);
//
//    Path dirPath = Paths.get("src/main/resources/static/user-data/photos/");
//
//    String[] temp = file.getOriginalFilename().split("\\.");
//    String fileExtension = "." + temp[temp.length - 1];
//
//    String fileName = UUID.randomUUID() + fileExtension;
//
//    Path filePath = dirPath.resolve(fileName);
//
//    try {
//      Files.createDirectories(dirPath);
//      file.transferTo(filePath);
////      InputStream inputStream = file.getInputStream();
////      Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    return "redirect:/login";
//  }

}
