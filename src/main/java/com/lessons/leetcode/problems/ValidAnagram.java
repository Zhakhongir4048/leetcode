package com.lessons.leetcode.problems;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/valid-anagram/description/">...</a>
 * timer 00 : 02 : 25
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] sCharsArray = s.toCharArray();
        char[] tCharsArray = t.toCharArray();
        Arrays.sort(sCharsArray);
        Arrays.sort(tCharsArray);
        s = new String(sCharsArray);
        t = new String(tCharsArray);
        return s.equals(t);
    }

}