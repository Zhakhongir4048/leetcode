package com.lessons.leetcode.problems;

public class PalindromeNumber {

  public static boolean isPalindrome(int number) {
    String stringNumber = String.valueOf(number);
    int lengthStringNumber = stringNumber.length();
    for (int i = 0; i < (lengthStringNumber / 2); ++i) {
      if (stringNumber.charAt(i) != stringNumber.charAt(lengthStringNumber - i - 1)) {
        return false;
      }
    }
    return true;
  }

}