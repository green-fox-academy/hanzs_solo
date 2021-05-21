package week_03.OO.FleetOfThings;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
  private List<Thing> things = new ArrayList<>();

  public Fleet() {
    things = new ArrayList<>();
  }

  public void add(Thing thing) {
    things.add(thing);
  }

  @Override
  public String toString() {
    String result = "";
    for (int i = 0; i < things.size(); i++) {
      result += (i + 1) + ". " + things.get(i) + "\n";
    }
    return result;
  }
}