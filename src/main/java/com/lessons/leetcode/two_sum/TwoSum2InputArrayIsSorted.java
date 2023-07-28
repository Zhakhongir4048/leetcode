package com.lessons.leetcode.two_sum;

/**
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">...</a>
 * timer 00 : 01 : 40
 */
public class TwoSum2InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = 1;
        while (true) {
            if (numbers[left] + numbers[right] < target) {
                left++;
                right++;
            } else if (numbers[left] + numbers[right] > target) {
                left--;
            } else return new int[]{++left, ++right};
        }
    }

}