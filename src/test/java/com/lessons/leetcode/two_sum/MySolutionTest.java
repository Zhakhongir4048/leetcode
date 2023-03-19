package com.lessons.leetcode.two_sum;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MySolutionTest {

  @Test
  void twoSumTestCaseOneSuccess() {
    int[] nums = {2, 7, 11, 15};
    Assertions.assertEquals("[0, 1]", Arrays.toString(MySolution.twoSum(nums, 9)));
  }

  @Test
  void twoSumTestCaseTwoSuccess() {
    int[] nums = {3, 2, 4};
    Assertions.assertEquals("[1, 2]", Arrays.toString(MySolution.twoSum(nums, 6)));
  }

  @Test
  void twoSumTestCaseThreeSuccess() {
    int[] nums = {3, 3};
    Assertions.assertEquals("[0, 1]", Arrays.toString(MySolution.twoSum(nums, 6)));
  }

}