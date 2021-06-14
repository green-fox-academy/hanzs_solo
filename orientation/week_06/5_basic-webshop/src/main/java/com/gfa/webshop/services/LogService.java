package com.gfa.webshop.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

  private List<String> logToList;

  @Autowired
  public LogService() {
    logToList = new ArrayList<>();
    logToList.add("");
  }

  public void log(String log) {
    logLogic("anonymus - " + log);
  }

  public void log(HttpServletRequest request, String log) {
    logLogic(request.getRemoteAddr() + " - " + log);
  }

  private void logLogic(String log) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter dateTimeFormatterForPath = DateTimeFormatter.ofPattern("yyyy.MM.dd.");
    Path logPath = Paths.get(
        "src/main/java/com/gfa/webshop/logs/logs_" + dateTimeFormatterForPath.format(now) + "txt");

    log = dateTimeFormatter.format(now) + " | " + log;
    tryToLog(log, logPath);
  }

  private void tryToLog(String log, Path logPath) {
    System.out.println(log);
    logToList.set(0, log);
    if (!Files.exists(logPath)) {
      try {
        Files.createFile(logPath);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    try {
      Files.write(logPath, logToList, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
