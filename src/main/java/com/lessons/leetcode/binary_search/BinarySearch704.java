package com.lessons.leetcode.binary_search;

/**
 * <a href="https://leetcode.com/problems/binary-search/">...</a>
 */
public class BinarySearch704 {

    public int search(int[] nums, int target) {
        // Начальный индекс
        int left = 0;
        // Конечный индекс
        int right = nums.length - 1;
        // Проверяем, что начальный индекс меньше, либо равно конечному
        while (left <= right) {
            // Находим индекс середины в массиве
            int mid = (right + left) / 2;
            // Проверяем, что значение середины массива совпадает с target. Если повезёт, может будет O(1)
            if (nums[mid] == target) {
                // Возвращаем индекс середины
                return mid;
                // Проверяем что target больше значения середины массива
            } else if (nums[mid] < target) {
                // Если так, то начало массива будет уже с середины + 1
                left = mid + 1;
            } else {
                // Иначе конец массива будет уже с середины - 1
                right = mid - 1;
            }
        }
        // Если не найдём, то возвращаем -1
        return -1;
    }

    public int binarySearchRec(int[] nums, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) return mid;
        if (nums[mid] < target) return binarySearchRec(nums, target, mid + 1, end);
        else return binarySearchRec(nums, target, start, mid - 1);
    }
}
