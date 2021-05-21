package week_04.AbstractsAndInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music.instrument.stringedinstrument;

import week_04.AbstractsAndInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music.instrument.StringedInstrument;

/**
 * Bass Guitar (4 strings, "Duum-duum-duum")
 */
//subclass of StringedInstrument
public class BassGuitar extends StringedInstrument {
  // fields

  // constructors
  public BassGuitar() {
    this(4);
  }

  public BassGuitar(int numberOfStrings) {
    super("Bass Guitar", numberOfStrings);
  }

  // methods
  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  // getters and setters
}
