package com.lessons.leetcode.two_pointers;

/**
 * Ready
 * <a href="https://leetcode.com/problems/valid-palindrome/description/">...</a>
 */
public class ValidPalindrome125Java {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] array = s.toCharArray();

        while (left <= right) {
            if (!isLetterOrDigit(array[left])) {
                left++;
            } else if (!isLetterOrDigit(array[right])) {
                right--;
            } else if (toLowerCase(array[left]) != toLowerCase(array[right])) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public boolean isLetterOrDigit(char c) {
        return (((c >= '0') && (c <= '9')) || (c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z'));
    }

    public static char toLowerCase(char c) {
        return (c >= 'A' && c <= 'Z') ? (char) ('a' + (c - 'A')) : c;
    }
}
