package Basics.week_04.AbstractsAndInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music.instrument.stringedinstrument;

import Basics.week_04.AbstractsAndInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music.instrument.StringedInstrument;

/**
 * Violin (4 strings, "Screech")
 */
//subclass of StringedInstrument
public class Violin extends StringedInstrument {
  //
  // fields

  //
  // constructors
  public Violin() {
    this(4);
  }

  public Violin(int numberOfStrings) {
    super("Violin", numberOfStrings);
  }

  //
  // methods
  @Override
  public String sound() {
    return "Screech";
  }

  //
  // getters and setters
}
