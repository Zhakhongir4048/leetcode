package com.lessons.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

    private static ContainsDuplicate containsDuplicate;

    @BeforeAll
    static void beforeAll() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void containsDuplicateCase1() {
        int[] nums = {1, 2, 3, 1};
        assertThat(containsDuplicate.containsDuplicate(nums)).isTrue();
    }

    @Test
    void containsDuplicateCase2() {
        int[] nums = {1, 2, 3, 4};
        assertThat(containsDuplicate.containsDuplicate(nums)).isFalse();
    }

    @Test
    void containsDuplicateCase3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertThat(containsDuplicate.containsDuplicate(nums)).isTrue();
    }

}