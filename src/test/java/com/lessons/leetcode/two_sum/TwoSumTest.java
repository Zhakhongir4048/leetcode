package com.lessons.leetcode.two_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void twoSumCase1() {
        int[] nums = {2, 7, 11, 15};
        assertThat(TwoSum.twoSum(nums, 9))
                .isEqualTo(new int[]{0, 1});
    }

    @Test
    void twoSumCase2() {
        int[] nums = {3, 2, 4};
        assertThat(TwoSum.twoSum(nums, 6))
                .isEqualTo(new int[]{1, 2});
    }

    @Test
    void twoSumCase3() {
        int[] nums = {3, 3};
        assertThat(TwoSum.twoSum(nums, 6))
                .isEqualTo(new int[]{0, 1});
    }

}