package com.lessons.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

  @Test
  void isPalindromeExpectTrue() {
    Assertions.assertTrue(PalindromeNumber.isPalindrome(121));
  }

  @Test
  void isPalindromeExpectTrueTwo() {
    Assertions.assertTrue(PalindromeNumber.isPalindrome(4004));
  }

  @Test
  void isPalindromeExpectFalse() {
    Assertions.assertFalse(PalindromeNumber.isPalindrome(-121));
  }

  @Test
  void isPalindromeExpectFalseTwo() {
    Assertions.assertFalse(PalindromeNumber.isPalindrome(-4004));
  }

}