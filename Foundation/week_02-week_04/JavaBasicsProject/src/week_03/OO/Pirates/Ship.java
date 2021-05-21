package week_03.OO.Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  //  The place for the Pirates
  //
  //  Create a Ship class.
  //  The Ship stores Pirate instances in a list as the crew and has one captain who is also a Pirate.
  //  When a ship is created it doesn't have a crew or a captain.
  //  The ship can be filled with pirates and a captain via fillShip() method:
  //  fills the ship with a captain and a random (maximum 113) number of pirates
  //  Ships should be represented in a nice way on command line including information about
  //  rum consumed by the captain and its state (dead or alive)
  //  number of alive pirates in the crew
  //  Ships should have a method to battle other ships: ship.battle(otherShip)
  //  should return true if the actual ship (this) wins
  //  the ship having higher calculated score wins
  //  calculated score: Number of alive pirates in the crew - Number of consumed rum by the captain
  //  The loser crew has a random number of losses (deaths).
  //  The winning captain and crew has a party: everyone drinks a random number of rum :)

  private Pirate captain;
  private List<Pirate> crew = new ArrayList<>();
  private int shipCapacity = 133;
  Random random = new Random();

  public void fillShip() {
    captain = new Pirate();
    int numberOfRecruits = random.nextInt(shipCapacity - 1) + 1;
    for (int i = 0; i < numberOfRecruits; i++) {
      crew.add(new Pirate());
    }
  }

  public void shipStatus() {
    if (captain.isDead()) {
      System.out.println("Ships captain is dead");
    } else {
      System.out.println("Ships captain is alive ");
    }
    System.out.println("He consumed " + captain.getToxicity() + " bottles of rum.");
    System.out.println("There are " + countAlive(crew) + " alive men on board.");
  }

  public boolean battle(Ship otherShip) {
    boolean weWon;

    Ship winnerShip;
    Ship looserShip;
    if (calculateScore(crew, captain.getToxicity()) >
        calculateScore(otherShip.getCrew(), otherShip.getCaptain().getToxicity())) {
      winnerShip = this;
      looserShip = otherShip;
      weWon = true;
    } else {
      winnerShip = otherShip;
      looserShip = this;
      weWon = false;
    }

    //winner
    int rumToDrink = random.nextInt(100);
    for (int i = 0; i < rumToDrink; i++) {
      winnerShip.getCaptain().drinkSomeRum();
    }
    rumToDrink = random.nextInt(100);
    for (Pirate men : winnerShip.getCrew()) {
      for (int i = 0; i < rumToDrink; i++) {
        men.drinkSomeRum();
      }
    }

    //looser
    //if (looserShip.getCrew().size() ==0) return weWon;

    int menToKill = random.nextInt(looserShip.getCrew().size());
    for (int i = 0; i < menToKill; i++) {
      looserShip.getCrew().get(i).die();
    }
    return weWon;
  }


  private int calculateScore(List<Pirate> crew, int rumConsumedByCaptain) {
    return countAlive(crew) - rumConsumedByCaptain;
  }

  private int countAlive(List<Pirate> crew) {
    int alive = 0;
    for (Pirate men : crew) {
      if (!men.isDead()) {
        alive++;
      }
    }
    return alive;
  }

  public Pirate getCaptain() {
    return captain;
  }

  public List<Pirate> getCrew() {
    return crew;
  }
}

