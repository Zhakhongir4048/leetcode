package com.lessons.leetcode.sliding_window;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), left = 0, right = 0, count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < n) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
//            System.out.println(map + " после добавления");
            while (map.get(s.charAt(right)) > 1) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
//                System.out.println(map + " после удаления");
            }
            count = Math.max(count, right - left + 1);
            right++;
        }
        return count;
    }
}
