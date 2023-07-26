package com.lessons.leetcode.problems;

public class PalindromeString {

  public static boolean isPalindrome(String s) {
    if (s == null) {
      throw new IllegalStateException("Передали в параметр null значение!");
    }
    String stringOnlyLettersAndNumbers = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
    int lengthStringOnlyLettersAndNumbers = stringOnlyLettersAndNumbers.length();
    for (int i = 0; i < (lengthStringOnlyLettersAndNumbers / 2); ++i) {
      if (!String.valueOf(stringOnlyLettersAndNumbers.charAt(i)).equalsIgnoreCase(
          String.valueOf(
              stringOnlyLettersAndNumbers.charAt(lengthStringOnlyLettersAndNumbers - i - 1)))) {
        return false;
      }
    }
    return true;
  }

}