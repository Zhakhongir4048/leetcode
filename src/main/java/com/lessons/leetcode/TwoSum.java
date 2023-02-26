package com.lessons.leetcode;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    int[] result;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 1; j < nums.length; j++) {
        if (nums[i] == nums[j] && i == j) {
          continue;
        }
        if (nums[i] + nums[j] == target) {
          result = new int[]{i, j};
          return result;
        }
      }
    }
    return new int[]{};
  }

}