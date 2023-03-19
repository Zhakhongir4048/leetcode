package com.lessons.leetcode.two_sum;

public class SolutionTwo {

  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int k = i + 1; k < nums.length; k++) {
        if (nums[i] == target - nums[k]) {
          return new int[]{i, k};
        }
      }
    }
    return new int[]{};
  }

}