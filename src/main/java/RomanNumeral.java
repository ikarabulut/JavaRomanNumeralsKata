package com.ikarabulut;

public class RomanNumeral {

  public String converter(int num) {
    String roman = "";
    while (num > 0) {
      if (num >= 1000) {
        roman += "M";
        num -= 1000;
      } else if (num >= 500) {
        roman += "D";
        num -= 500;
      } else if (num >= 100) {
        roman += "C";
        num -= 100;
      } else if (num >= 50) {
        roman += "L";
        num -= 50;
      } else if (num >= 10) {
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

