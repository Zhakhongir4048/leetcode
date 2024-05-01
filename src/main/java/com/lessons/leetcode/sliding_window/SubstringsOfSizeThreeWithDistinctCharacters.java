package com.lessons.leetcode.sliding_window;

import java.util.HashMap;

public class SubstringsOfSizeThreeWithDistinctCharacters {

    static class Solution {
        public static int countGoodSubstrings(String s) {
            int i = 0;
            int j = 0;
            int count = 0;
            HashMap<Character, Integer> bi = new HashMap<>();
            while (j < s.length()) {
                bi.put(s.charAt(j), bi.getOrDefault(s.charAt(j), 0) + 1);
                if ((j - i + 1) < 3) {
                    j++;
                } else {
                    if (bi.size() == 3) {
                        count++;
                    }
                    bi.put(s.charAt(i), bi.get(s.charAt(i)) - 1);
                    if (bi.get(s.charAt(i)) == 0) {
                        bi.remove(s.charAt(i));
                    }
                    i++;
                    j++;
                }
            }
            return count;
        }
    }
}
