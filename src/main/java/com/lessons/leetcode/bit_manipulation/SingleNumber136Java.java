package com.lessons.leetcode.bit_manipulation;

/**
 * Ready
 * <a href="https://leetcode.com/problems/single-number/description/">...</a>
 */
public class SingleNumber136Java {

    public int singleNumber(int[] nums) {
        int result = 0; // Начинаем с нуля
        // Применяем XOR ко всем числам в массиве
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result; // Возвращаем уникальное число
    }
}
