package com.lessons.leetcode.hash_table;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    @DisplayName("TwoSum.twoSum case1")
    void twoSumCase1() {
        assertThat(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
    }

    @Test
    @DisplayName("TwoSum.twoSum case2")
    void twoSumCase2() {
        assertThat(TwoSum.twoSum(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
    }

    @Test
    @DisplayName("TwoSum.twoSum case3")
    void twoSumCase3() {
        assertThat(TwoSum.twoSum(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
    }

    @Test
    @DisplayName("TwoSum.twoSum case4")
    void twoSumCase4() {
        assertThat(TwoSum.twoSum(new int[]{3, 2, 3}, 6)).isEqualTo(new int[]{0, 2});
    }

    @Test
    @DisplayName("TwoSum.twoSum2 case1")
    void twoSum2Case1() {
        assertThat(TwoSum.twoSum2(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
    }

    @Test
    @DisplayName("TwoSum.twoSum2 case2")
    void twoSum2Case2() {
        assertThat(TwoSum.twoSum2(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
    }

    @Test
    @DisplayName("TwoSum.twoSum2 case3")
    void twoSum2Case3() {
        assertThat(TwoSum.twoSum2(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
    }

    @Test
    @DisplayName("TwoSum.twoSum2 case4")
    void twoSum2Case4() {
        assertThat(TwoSum.twoSum2(new int[]{3, 2, 3}, 6)).isEqualTo(new int[]{0, 2});
    }
}
