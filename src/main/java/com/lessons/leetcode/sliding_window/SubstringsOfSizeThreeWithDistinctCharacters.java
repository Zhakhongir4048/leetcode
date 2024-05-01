package com.lessons.leetcode.sliding_window;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/">...</a>
 */
public class SubstringsOfSizeThreeWithDistinctCharacters {

    public static int countGoodSubstrings(String s) {
        int left = 0;
        int right = 0;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            if ((right - left + 1) >= 3) {
                if (map.size() == 3) {
                    count++;
                }
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            right++;
        }
        return count;
    }

    public static int countGoodSubstrings2(String s) {
        int n = s.length();
        if (n < 3) {
            return 0;
        }
        int count = 0;
        char a = s.charAt(0), b = s.charAt(1), c = s.charAt(2);
        if (a != b && b != c && a != c) {
            count++;
        }
        for (int i = 3; i < n; i++) {
            a = b;
            b = c;
            c = s.charAt(i);
            if (a != b && b != c && a != c) {
                count++;
            }
        }
        return count;
    }
}
