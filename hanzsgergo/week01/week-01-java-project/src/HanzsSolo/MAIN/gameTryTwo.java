package HanzsSolo.MAIN;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class gameTryTwo {
  public static void main(String[] args) throws InterruptedException {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    boolean playMode = true;
    List<int[]> bricks = new ArrayList<>();


    int[] player = {6, 11};
    String playerName = getPlayerName(scanner);
    int playerHealth = 3;
    int score = 0;

    boolean wantsToPlay = true;

    while (playMode) {
      addNewBricks(random, bricks);
      setPlayGround(bricks, player, playerName, playerHealth, score);
      wantsToPlay = getPlayerInputAndSetPosition(scanner, player);
      playMode = setPlayerHealthAndPlayMode(bricks, player, playerHealth, wantsToPlay);
      gravity(bricks);
      removeOldBricks(bricks);
      score++;
    }
    System.out.println("Game session ended.");
  }


  private static String getPlayerName(Scanner scanner) {
    String playerName = "";
    int enterAttempts = 0;

    while (playerName.length() != 3) {
      if (enterAttempts == 0) {
        System.out.print("Enter the first three letter of your name: ");
      } else {
        System.out.println("You can enter only three character: ");
        System.out.print("Enter the first three letter of your name: ");
      }
      playerName = scanner.next();
      System.out.println();
      enterAttempts++;
    }
    return playerName;
  }

  private static void addNewBricks(Random random, List<int[]> bricks) {
    int[] newBrick = new int[2];
    newBrick[0] = random.nextInt(12);
    newBrick[1] = 0;

    bricks.add(newBrick);
  }

  private static void setPlayGround(List<int[]> bricks, int[] player, String playerName,
                                    int playerHealth, int score) {
    System.out.println(" ____________________________________");
    for (int i = 0; i < 12; i++) {
      System.out.print("|");
      for (int j = 0; j < 12; j++) {
        setThisSpace(bricks, player, i, j, playerName);
      }
      System.out.print("|");
      System.out.println();
    }

    System.out.println("|Player: " + playerName + " |Health: " + playerHealth + " |Score: "+score);
  }

  private static void setThisSpace(List<int[]> bricks, int[] player, int i, int j,
                                   String playerName) {

    boolean isBrick = false;
    boolean isPlayer = false;

    for (int[] currentBrick : bricks) {
      if (currentBrick[0] == j && currentBrick[1] == i) {
        isBrick = true;
      }
    }
    if (player[0] == j && player[1] == i) {
      isPlayer = true;
    }
    //--------------
    if (isPlayer) {
      System.out.print(playerName);
    } else if (isBrick) {
      System.out.print("---");
    } else {
      System.out.print("   ");
    }

  }

  private static boolean getPlayerInputAndSetPosition(Scanner scanner, int[] player) {
    String playerInput = scanner.next();
    if ((playerInput.equals("a") || playerInput.equals("A")) && player[0] > 0) {
      player[0]--;
    } else if ((playerInput.equals("d") || playerInput.equals("D")) && player[0] < 11) {
      player[0]++;
    } else if (playerInput.equals("q") || playerInput.equals("Q")) {
      return false;
    }
    return true;
  }

  private static boolean setPlayerHealthAndPlayMode(List<int[]> bricks, int[] player,
                                                    int playerHealth,
                                                    boolean wantsToPlay) {
    for (int[] currentBrick : bricks) {
      if (player[0] == currentBrick[0] && player[1] == currentBrick[1]) {
        playerHealth--;
      }
    }
    return playerHealth > 0 && wantsToPlay;
  }

  private static void gravity(List<int[]> bricks) {
    for (int i = 0; i < bricks.size(); i++) {
      int[] currentBrick = bricks.get(i);
      currentBrick[1]++;
      bricks.set(i, currentBrick);
    }
  }

  private static void removeOldBricks(List<int[]> bricks) {
    for (int i = 0; i < bricks.size(); i++) {
      int[] currentBrick = bricks.get(i);
      if (currentBrick[1] > 12) {
        bricks.remove(i);
        i--;
      }

    }
  }


}
