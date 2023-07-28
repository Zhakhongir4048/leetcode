package com.lessons.leetcode.two_sum;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSum2InputArrayIsSortedTest {

    private static TwoSum2InputArrayIsSorted twoSum2InputArrayIsSorted;

    @BeforeAll
    static void beforeAll() {
        twoSum2InputArrayIsSorted = new TwoSum2InputArrayIsSorted();
    }

    @Test
    void twoSumCase1() {
        assertThat(twoSum2InputArrayIsSorted.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{1, 2});
    }

    @Test
    void twoSumCase2() {
        assertThat(twoSum2InputArrayIsSorted.twoSum(new int[]{2, 3, 4}, 6)).isEqualTo(new int[]{1, 3});
    }

    @Test
    void twoSumCase3() {
        assertThat(twoSum2InputArrayIsSorted.twoSum(new int[]{-1, 0}, -1)).isEqualTo(new int[]{1, 2});
    }

}