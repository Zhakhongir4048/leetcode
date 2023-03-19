package com.lessons.leetcode.two_sum;

import java.util.HashMap;
import java.util.Map;

public class SolutionThree {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int requiredNumber = target - nums[i];
      if (map.containsKey(requiredNumber) && map.get(requiredNumber) != i) {
        return new int[]{map.get(requiredNumber), i};
      }
    }
    throw new IllegalArgumentException("Fail");
  }

}