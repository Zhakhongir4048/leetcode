package com.lessons.leetcode.math;

/**
 * Ready
 * <a href="https://leetcode.com/problems/reverse-integer/description/">...</a>
 */
public class ReverseInteger7 {

    public int reverse(int x) {
        long reverse = 0;
        long value = x;
        while (value != 0) {
            // Извлекаем так последний элемент. 123 % 10 = 3
            // 1 итерация = 0 * 10 + 3 = 3
            // 2 итерация = 3 * 10 + 2 = 32
            // 3 итерация = 32 * 10 + 1 = 321 - Ответ
            reverse = reverse * 10 + value % 10;
            // Удаляем каждый раз последнюю цифру, чтобы идти налево и брать другую цифру
            // 123 / 10 = 12
            // 12 / 10 = 1
            // 1 / 10 = 0
            value /= 10;
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) return 0;
        }
        return (int) reverse;
    }
}
