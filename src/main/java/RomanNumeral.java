package com.ikarabulut;

public class RomanNumeral {

  public String converter(int num) {
    String roman = "";
    while (num > 0) {
      if (num >= 10) {
        roman += "X";
        num = num - 10;
      } else if (num >= 5) {
        roman += "V";
        num = num - 5;
      } else if (num > 0) {
        roman += "I";
        num = num - 1;
      }
    }
  return roman;
  }

}

