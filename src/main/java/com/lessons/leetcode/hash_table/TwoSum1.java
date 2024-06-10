package com.lessons.leetcode.hash_table;


import java.util.HashMap;
import java.util.Map;

/**
 * Ready
 * <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 */
public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer find = numsMap.get(target - nums[i]);
            if (find != null)
                return new int[]{find, i};
            numsMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
