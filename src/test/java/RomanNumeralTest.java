package com.ikarabulut;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
 
  @Test
  public void makeSureJunitWorks() {
    assertEquals(1, 1);
  }
  
  @Test
  public void oneShouldReturnI() {
    RomanNumeral one = new RomanNumeral();
    String conversion = one.converter(1);
    assertEquals("I", conversion);
  }

  @Test
  public void twoShouldReturnII() {
    RomanNumeral roman = new RomanNumeral();
    String conversion = roman.converter(2);
    assertEquals("II", conversion);
  }

  @Test
  public void fiveShouldReturnV() {
    RomanNumeral roman = new RomanNumeral();
    String conversion = roman.converter(5);
    assertEquals("V", conversion);
  }

  @Test
  public void sevenShouldReturnVII() {
    RomanNumeral roman = new RomanNumeral();
    String conversion = roman.converter(7);
    assertEquals("VII", conversion);
  }
  
  @Test
  public void tenShouldReturnX() {
    RomanNumeral roman = new RomanNumeral();
    String conversion = roman.converter(10);
    assertEquals("X", conversion);
  }

}
