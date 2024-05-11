package com.lessons.leetcode.sliding_window;

import java.util.HashMap;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0; // 0, 1, 2, 3
        int r = 0; // 0, 1, 2, 3, 4, 5
        int sum = 0; // 0, 2, 5, 6, 10, 7, 6,
        int maxValue = Integer.MAX_VALUE; //
        int min = maxValue; // 4, 4, 3, 2
        while (r < nums.length) {
            sum += nums[r];
            while (sum >= target) {
                // 8 - 2 = 6
                // 10 - 3 = 7
                // 7 - 1 = 6
                // 9 - 2 = 7
                sum -= nums[l];
                min = Math.min(r - l + 1, min);
                // 3 - 0 + 1, maxValue
                // 4 - 1 + 1, 4
                // 4 - 2 + 1, 4
                // 5 - 3 + 1, 3
                l++;
            }
            r++;
        }
        if (min == maxValue) {
            return 0;
        }
        return min;
    }


    public static void main(String[] args) {

        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
        System.out.println(Math.abs(-1));
    }
}
