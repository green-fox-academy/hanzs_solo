package Basics.OO.Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
  //  Create an Armada class
  //  Contains a list of Ship
  //  Have a armada.war(otherArmada) method where two armada can engage in war
  //  it should work like merge sort
  //  first ship from the first armada battles the first one from the other
  //  the loser ship gets skipped so the next ship comes in play from the loser ship's armada
  //  it starts a battle with the first (not yet defeated) ship from the other armada
  //  whichever armada gets to the end of its ships loses the war
  //  return true if this is the winner

  private List<Ship> armada = new ArrayList<>();

  public boolean war(Armada enemyArmada) {
    int index1 = 0;
    int index2 = 0;

    while (index1 < armada.size() && index2 < enemyArmada.armada.size()) {
      boolean result = armada.get(index1).battle(enemyArmada.armada.get(index2));
      if (result) {
        index2++;
      } else {
        index1++;
      }
    }
    return index1 == armada.size()-1;
  }

  public List<Ship> getArmada() {
    return armada;
  }
}
