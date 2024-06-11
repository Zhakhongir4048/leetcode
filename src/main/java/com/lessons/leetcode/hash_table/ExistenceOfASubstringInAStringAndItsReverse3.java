package com.lessons.leetcode.hash_table;

/**
 * Ready
 * <a href="https://leetcode.com/problems/existence-of-a-substring-in-a-string-and-its-reverse/description/">...</a>
 */
public class ExistenceOfASubstringInAStringAndItsReverse3 {

    public boolean isSubstringPresent(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        for (int i = 0, j = 1; j < s.length(); i++, j++)
            if (reverse.contains(s.substring(i, j + 1))) return true;
        return false;
    }
}
