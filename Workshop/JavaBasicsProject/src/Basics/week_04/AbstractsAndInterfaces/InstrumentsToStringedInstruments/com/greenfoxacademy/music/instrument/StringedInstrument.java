package Basics.week_04.AbstractsAndInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music.instrument;

import Basics.week_04.AbstractsAndInterfaces.InstrumentsToStringedInstruments.com.greenfoxacademy.music.Instrument;

/**
 * Next, we add another abstract class, StringedInstrument which extends Instrument.
 * It
 * introduces numberOfStrings and
 * sound() method what's implementation is yet unknown
 * but with the help of the sound() the play() method is fully implementable
 * <p>
 * StringedInstrument has 3 descendants, namely:
 * Electric Guitar (6 strings, "Twang")
 * Bass Guitar (4 strings, "Duum-duum-duum")
 * Violin (4 strings, "Screech")
 */

//superclass, subclass of Instrument
public abstract class StringedInstrument extends Instrument {
  //
  // fields

  //
  // constructors
  public StringedInstrument(String name, int numberOfStrings) {
    super(name,numberOfStrings + "-stringed");
  }

  //
  // methods

  //
  // getters and setters
}

