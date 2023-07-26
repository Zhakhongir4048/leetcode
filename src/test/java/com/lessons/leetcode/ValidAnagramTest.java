package com.lessons.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    private static ValidAnagram validAnagram;

    @BeforeAll
    static void beforeAll() {
        validAnagram = new ValidAnagram();
    }

    @Test
    void isAnagramCase1() {
        Assertions.assertThat(validAnagram.isAnagram("anagram", "nagaram")).isTrue();
    }

    @Test
    void isAnagramCase2() {
        Assertions.assertThat(validAnagram.isAnagram("rat", "car")).isFalse();
    }

}