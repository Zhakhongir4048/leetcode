package com.lessons.leetcode.math;

/**
 * Ready
 * <a href="https://leetcode.com/problems/palindrome-number/description/">...</a>
 */
public class PalindromeNumber9 {

    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int r = num.length() - 1;

        for (char left : num.toCharArray()) {
            char right = num.charAt(r);
            if (!Character.isLetterOrDigit(left) || !Character.isLetterOrDigit(right) || left != right) return false;
            r--;
        }
        return true;
    }
}
