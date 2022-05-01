package com.ikarabulut;

public class RomanNumeral {
  public String single = "I";
  public String five = "V";

  public String converter(int num) {
    String roman = "";
    for (int i = 0; i < num; i++) {
      roman += single;
    }
    return roman;
  }

}

