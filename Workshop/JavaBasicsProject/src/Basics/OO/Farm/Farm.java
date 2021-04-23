package Basics.OO.Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  //  Reuse your Animal class
  //  Create a Farm class
  //  it has a list of Animals
  //  it has a limit that defines how many animals can be kept in the Farm
  //  it has two methods:
  //  breed() -> creates a new animal if there's place for it
  //  sell() -> removes the least hungry animal

  List<Animal> animalList = new ArrayList<>();
  int limit = 10;

  public void breed() {
    if (animalList.size() < limit) {
      animalList.add(new Animal());
    }
  }

  public void sell() {
    int leastHunger = 0;
    int leastHungryIndex = 0;
    for (int i = 0; i < animalList.size(); i++) {
      if (animalList.get(i).getHunger() > leastHunger) {
        leastHunger = animalList.get(1).getHunger();
        leastHungryIndex = i;
      }
    }
    animalList.remove(leastHungryIndex);
  }

}
