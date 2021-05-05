package Basics.week_04.Testing.Apples.Tests;

import static org.junit.jupiter.api.Assertions.*;

import Basics.week_04.Testing.Apples.Task.Apples;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ApplesTest {
  Apples apples;
  @BeforeEach
  void setup(){
    apples = new Apples();
  }
  @Test
  void TestReturnApple1() {
    String expected = "apple";
    String actual = apples.returnApple();
    assertEquals(expected,actual);
  }
  @Test
  void TestReturnApple2() {
    String expected = "apple";
    String actual = apples.returnApple();
    assertTrue(expected.equals(actual));
  }
  @Test
  void TestReturnApple3() {
    String expected = "apple";
    String actual = apples.returnApple();
    assertFalse(!expected.equals(actual));
  }
}