package com.lessons.leetcode.hash_table;


import java.util.HashMap;
import java.util.Map;

/**
 * Ready
 * <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 */
public class TwoSum1Java {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[]{numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }
}
