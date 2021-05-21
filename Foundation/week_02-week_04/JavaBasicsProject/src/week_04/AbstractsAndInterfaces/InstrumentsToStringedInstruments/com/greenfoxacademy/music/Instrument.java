package week_04.AbstractsAndInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music;

/**
 * We start with a base,
 * abstract class Instrument.
 * it reserves (e.g. protected) the name of the instrument
 * it should provide a play() method.
 */
public abstract class Instrument {
  // fields
  private String name;
  private String special;

  // constructors
  public Instrument(String name, String special) {
    this.name = name;
    this.special = special;
  }

  // methods
  public final void play() {
    System.out.println(name + ", " + special + " instrument that goes " + sound());
  }

  public abstract String sound();

  // getters and setters
}
