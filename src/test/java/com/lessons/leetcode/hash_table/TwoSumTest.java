package com.lessons.leetcode.hash_table;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void twoSumCase1() {
        assertThat(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
    }

    @Test
    void twoSumCase2() {
        assertThat(TwoSum.twoSum(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
    }

    @Test
    void twoSumCase3() {
        assertThat(TwoSum.twoSum(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
    }

    @Test
    void twoSumCase4() {
        assertThat(TwoSum.twoSum(new int[]{3, 2, 3}, 6)).isEqualTo(new int[]{0, 2});
    }
}
