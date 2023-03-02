package com.lessons.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeStringTest {

  @Test
  void isPalindromeTest() {
    Assertions.assertTrue(PalindromeString.isPalindrome("A man, a plan, a canal: Panama"));
  }

  @Test
  void isPalindromeTestTwo() {
    Assertions.assertTrue(PalindromeString.isPalindrome("A_man,/a plan,__ a _@canal: Panama"));

  }

  @Test
  void isPalindromeTestThree() {
    Assertions.assertTrue(PalindromeString.isPalindrome(" "));
  }

  @Test
  void isPalindromeTestFour() {
    Assertions.assertFalse(PalindromeString.isPalindrome("race a car"));
  }

}