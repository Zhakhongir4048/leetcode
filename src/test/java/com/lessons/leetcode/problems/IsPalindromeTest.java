package com.lessons.leetcode.problems;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class IsPalindromeTest {

    private static IsPalindrome isPalindrome;

    @BeforeAll
    static void beforeAll() {
        isPalindrome = new IsPalindrome();
    }

    @Test
    void isPalindrome() {
        isPalindrome.isPalindrome("A man, a plan, a canal: Panama");
    }

}