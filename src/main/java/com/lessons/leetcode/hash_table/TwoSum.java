package com.lessons.leetcode.hash_table;


/**
 * @link <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[]{j - i, j};
                }
            }
        }
        return new int[]{};
    }
}
