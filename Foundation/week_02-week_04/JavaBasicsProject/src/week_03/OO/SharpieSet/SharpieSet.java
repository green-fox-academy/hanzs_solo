package week_03.OO.SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  //  Reuse your Sharpie class
  //  Create SharpieSet class
  //  it contains a list of Sharpie
  //  it has a method that adds a new Sharpie to the set: add(sharpie)
  //  it has a method that returns the number of usable Sharpies: countUsable() -> sharpie is usable if it contains ink
  //  it has a method that removes all unusable Sharpies: removeTrash()

  List<Sharpie> sharpieList = new ArrayList<>();

  public void add(Sharpie sharpie) {
    sharpieList.add(sharpie);
  }

  public int countUsable() {
    int usable = 0;
    for (Sharpie sharpie : sharpieList) {
      if (sharpie.inkAmount != 0) {
        usable++;
      }
    }
    return usable;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount == 0) {
        sharpieList.remove(i);
        i--;
      }
    }
  }

}
