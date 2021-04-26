package Basics.week_03.OO.Pirates;

import java.util.Random;

public class Pirate {
  //  Create a Pirate class. You can add other fields and methods, yet, you must have these methods:
  //
  //  drinkSomeRum() - intoxicates the Pirate by one
  //  howsItGoingMate() - when called, the Pirate replies:
  //      if drinkSomeRun() was called less than 4 times:
  //      "Pour me anudder!"
  //      else:
  //      "Arghh, I'ma Pirate. How d'ya d'ink its goin?". Then the pirate passes out and sleeps it off (gets rid of the intoxication).
  //  If you manage to get this far, then you can try to do the following.
  //
  //  brawl(Pirate) - where pirate fights another pirate (if both of them are alive):
  //  there is 1/3 chance that this dies, the other dies or they both pass out.
  //  die() - this kills off the pirate. When a pirate is dead, every method simply results in: he's dead.
  //  And... if you get that far...
  //
  //  Add a parrot.

  private int toxicity = 0;
  private boolean isDead = false;
  private int parrotsOwned = 0;

  public void drinkSomeRum() {
    if (isDead) {
      System.out.println("He's dead.");
      return;
    }
    toxicity++;
  }

  public void howsItGoingMate() {
    if (isDead) {
      System.out.println("He's dead.");
      return;
    }
    if (toxicity < 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      toxicity = 0;
    }
  }

  public void brawl(Pirate opponent) {
    if (isDead) {
      System.out.println("He's dead.");
      return;
    }
    Random random = new Random();
    int d = random.nextInt(3);
    switch (d) {
      case 0:
        die();
        System.out.println("He died..");
        break;
      case 1:
        opponent.die();
        System.out.println("Opponent died..");
        break;
      case 2:
        die();
        opponent.die();
        System.out.println("Both of them died..");
        break;
    }
  }

  public void stealAParrot() {
    if (isDead) {
      System.out.println("He's dead.");
      return;
    }
    parrotsOwned++;
  }

  public void die() {
    isDead = true;
  }

  public int getToxicity() {
    return toxicity;
  }

  public boolean isDead() {
    return isDead;
  }

  public int getParrotsOwned() {
    return parrotsOwned;
  }

}
