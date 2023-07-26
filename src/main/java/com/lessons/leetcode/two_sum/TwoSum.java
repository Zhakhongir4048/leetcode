package com.lessons.leetcode.two_sum;

/**
 * <a href="https://leetcode.com/problems/two-sum/submissions/">...</a>
 * timer 00 : 02 : 06
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0, j = 1;
        int gap = 1;
        while (true) {
            if (nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
                break;
            } else if (j == nums.length - 1) {
                gap++;
                i = 0;
                j = gap;
            } else {
                i++;
                j++;
            }
        }
        return result;
    }

}