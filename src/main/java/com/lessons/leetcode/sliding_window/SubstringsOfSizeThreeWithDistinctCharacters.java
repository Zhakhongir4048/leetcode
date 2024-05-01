package com.lessons.leetcode.sliding_window;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/">...</a>
 */
public class SubstringsOfSizeThreeWithDistinctCharacters {

    public static int countGoodSubstrings(String s) {
        int left = 0;
        int right = 0;
        int countGoodSubstrings = 0;
        HashMap<Character, Integer> characterCountHashMap = new HashMap<>();
        while (right < s.length()) {
            characterCountHashMap.put(s.charAt(right), characterCountHashMap.getOrDefault(s.charAt(right), 0) + 1);
            if ((right - left + 1) >= 3) {
                if (characterCountHashMap.size() == 3) {
                    countGoodSubstrings++;
                }
                characterCountHashMap.put(s.charAt(left), characterCountHashMap.get(s.charAt(left)) - 1);
                if (characterCountHashMap.get(s.charAt(left)) == 0) {
                    characterCountHashMap.remove(s.charAt(left));
                }
                left++;
            }
            right++;
        }
        return countGoodSubstrings;
    }
}
