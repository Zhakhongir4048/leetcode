package com.lessons.leetcode.sliding_window;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SubstringsOfSizeThreeWithDistinctCharactersTest {

    @Test
    void countGoodSubstringsCase1() {
        Assertions
                .assertThat(SubstringsOfSizeThreeWithDistinctCharacters.countGoodSubstrings("aababcabc"))
                .isEqualTo(4);
    }

    @Test
    void countGoodSubstringsCase2() {
        Assertions
                .assertThat(SubstringsOfSizeThreeWithDistinctCharacters.countGoodSubstrings("xyzzaz"))
                .isEqualTo(1);
    }

    @Test
    void countGoodSubstrings2Case1() {
        Assertions
                .assertThat(SubstringsOfSizeThreeWithDistinctCharacters.countGoodSubstrings2("aababcabc"))
                .isEqualTo(4);
    }

    @Test
    void countGoodSubstrings2Case2() {
        Assertions
                .assertThat(SubstringsOfSizeThreeWithDistinctCharacters.countGoodSubstrings2("xyzzaz"))
                .isEqualTo(1);
    }
}
