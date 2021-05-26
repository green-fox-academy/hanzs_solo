package com.gfa.webshop.services;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebshopService {

  List<String> logList;

  WebshopService(){
    logList = new ArrayList<>();
  }


  public void log(String log) {
    System.out.println(log);

    Path logPath = Paths.get("C:\\Users\\hanzs_solo\\Desktop\\ProjectFiles\\GFAProjectFiles\\repo_hanzs_solo\\Orientation\\week_06\\webshop\\src\\main\\java\\com\\gfa\\webshop\\logs.txt");

    if(logList.size() == 0){
      logList.add(log);
    }else {
      logList.set(0,log);
    }

    try {
      Files.write(logPath,logList, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
