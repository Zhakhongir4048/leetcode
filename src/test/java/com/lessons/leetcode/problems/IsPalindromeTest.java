package com.lessons.leetcode.problems;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IsPalindromeTest {

    private static IsPalindrome isPalindrome;

    @BeforeAll
    static void beforeAll() {
        isPalindrome = new IsPalindrome();
    }

    @Test
    void isPalindromeCase1() {
        assertThat(isPalindrome.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }

    @Test
    void isPalindromeCase2() {
        assertThat(isPalindrome.isPalindrome("race a car")).isFalse();
    }

    @Test
    void isPalindromeCase3() {
        assertThat(isPalindrome.isPalindrome(" ")).isTrue();
    }

}