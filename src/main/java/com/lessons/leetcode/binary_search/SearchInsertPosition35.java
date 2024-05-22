package com.lessons.leetcode.binary_search;

public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {
        if (target == 0 && nums[0] > target) return 0;

        int start = 0;
        int end = nums.length - 1;

        boolean isFind = false;
        int find = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                isFind = true;
                find = mid;
                break;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (isFind) {
            return find;
        } else {
            if (target > nums[nums.length - 1]) {
                return nums.length;
            }
            if (target < nums[0]) return 0;

            for (int i = 0, k = 1; i < nums.length; i++, k++) {
                if (nums[i] < target && target < nums[k]) {
                    return ++i;
                }
            }
        }
        return -1;
    }
}
