package com.lessons.leetcode.binary_search;

/**
 * <a href="https://leetcode.com/problems/binary-search/">...</a>
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        // Начальный индекс
        int left = 0;
        // Конечный индекс
        int right = nums.length - 1;
        // Проверяем, что начальный индекс меньше, либо равно конечному
        while (left <= right) {
            // Находим индекс середины в массиве
            int mid = left + (right - left) / 2;
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

    public static void main(String[] args) {
        int search = new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        System.out.println("search = " + search);
    }

}