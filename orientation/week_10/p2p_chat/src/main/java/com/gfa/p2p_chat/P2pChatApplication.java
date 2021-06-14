package com.gfa.p2p_chat;

import java.util.Map;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class P2pChatApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(P2pChatApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//
//    Map<String, String> environmentVariables = System.getenv();
//
//    for (String envName : environmentVariables.keySet()) {
//      System.out.println("- " + envName + " - "+environmentVariables.get(envName));
//      //System.out.format("%s=%s%n", envName, environmentVariables.get(envName));
//    }
  }
}
