package com.lessons.leetcode.math;

import java.math.BigInteger;

/**
 * Ready
 * <a href="https://leetcode.com/problems/plus-one/description/">...</a>
 */
public class PlusOne66 {

    public int[] plusOne(int[] digits) {
        int[] result;
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger ten = BigInteger.valueOf(10);

        for (int k : digits) {
            // (sum * 10) + (k % 10) - таким образом достаём первую цифру
            sum = (sum).multiply(ten).add(BigInteger.valueOf(k % 10));
        }

        // Прибавили 1
        sum = sum.add(BigInteger.valueOf(1));

        char[] charArray = String.valueOf(sum).toCharArray();
        result = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            // Обязательно нужно делать - '0', потому, что будет конвертация в цифру, а не цифру из Unicode
            result[i] = charArray[i] - '0';
        }

        return result;
    }
}
