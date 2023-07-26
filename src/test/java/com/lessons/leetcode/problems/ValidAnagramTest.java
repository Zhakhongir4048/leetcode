package com.lessons.leetcode.problems;

import com.lessons.leetcode.problems.ValidAnagram;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {

    private static ValidAnagram validAnagram;

    @BeforeAll
    static void beforeAll() {
        validAnagram = new ValidAnagram();
    }

    @Test
    void isAnagramCase1() {
        assertThat(validAnagram.isAnagram("anagram", "nagaram")).isTrue();
    }

    @Test
    void isAnagramCase2() {
        assertThat(validAnagram.isAnagram("rat", "car")).isFalse();
    }

}