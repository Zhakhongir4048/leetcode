package com.lessons.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

  @Test
  void twoSumTestCaseOneSuccess() {
    int[] nums = {2, 7, 11, 15};
    Assertions.assertEquals("[0, 1]", Arrays.toString(TwoSum.twoSum(nums, 9)));
  }

  @Test
  void twoSumTestCaseTwoSuccess() {
    int[] nums = {3, 2, 4};
    Assertions.assertEquals("[1, 2]", Arrays.toString(TwoSum.twoSum(nums, 6)));
  }

  @Test
  void twoSumTestCaseThreeSuccess() {
    int[] nums = {3, 3};
    Assertions.assertEquals("[0, 1]", Arrays.toString(TwoSum.twoSum(nums, 6)));
  }

}