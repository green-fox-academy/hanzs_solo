package Basics.week_04.AbstractsAndInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music.instrument.stringedinstrument;

import Basics.week_04.AbstractsAndInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music.instrument.StringedInstrument;

/**
 * Electric Guitar (6 strings, "Twang")
 */
//subclass of StringedInstrument
public class ElectricGuitar extends StringedInstrument {
  //
  // fields

  //
  // constructors
  public ElectricGuitar() {
    this(6);
  }

  public ElectricGuitar(int numberOfStrings) {
    super("Electric Guitar", numberOfStrings);
  }

  //
  // methods
  @Override
  public String sound() {
    return "Twang";
  }

  //
  // getters and setters
}
