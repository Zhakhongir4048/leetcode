package com.lessons.leetcode.problems;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagramsTest {

    private static GroupAnagrams groupAnagrams;

    @BeforeAll
    static void beforeAll() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    void groupAnagramsCase1() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("eat", "tea", "ate"));
        expected.add(List.of("bat"));
        expected.add(List.of("tan", "nat"));
        assertThat(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}))
                .isEqualTo(expected);
    }

    @Test
    void groupAnagramsCase2() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of(""));
        assertThat(groupAnagrams.groupAnagrams(new String[]{""}))
                .isEqualTo(expected);
    }

    @Test
    void groupAnagramsCase3() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("a"));
        assertThat(groupAnagrams.groupAnagrams(new String[]{"a"}))
                .isEqualTo(expected);
    }

}