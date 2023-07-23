package com.lessons.leetcode.binary_search;

/**
 * <a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/">...</a>
 */
public class FindMin {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right])
                right = mid;
            else
                left = mid + 1;
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {11, 13, 15, 17};
        int[] nums2 = {3, 4, 5, 1, 2};
        int min = findMin(nums);
        int min2 = findMin(nums2);
        System.out.println("min = " + min);
        System.out.println("min2 = " + min2);
    }

}