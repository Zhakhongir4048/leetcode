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
            if (isLetterOrDigit(array[left])) {
                left++;
            } else if (isLetterOrDigit(array[right])) {
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

    private boolean isLetterOrDigit(char source) {
        return (source >= 'A' && source <= 'Z') || (source >= 'a' && source <= 'z') || (source >= '0' && source <= '9');
    }

    private char toLowerCase(char source) {
        if (source >= 'A' && source <= 'Z') {
            return (char) ('a' + (source - 'A'));
        }
        return source;
    }

}
