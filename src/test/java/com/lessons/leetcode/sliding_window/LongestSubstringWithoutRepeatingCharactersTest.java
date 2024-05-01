package com.lessons.leetcode.sliding_window;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstringCase1() {
        Assertions.assertThat(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"))
                .isEqualTo(3);
    }

    @Test
    void lengthOfLongestSubstringCase2() {
        Assertions.assertThat(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"))
                .isEqualTo(1);
    }

    @Test
    void lengthOfLongestSubstringCase3() {
        Assertions.assertThat(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"))
                .isEqualTo(3);
    }
}
