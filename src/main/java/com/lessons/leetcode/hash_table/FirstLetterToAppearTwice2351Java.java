package com.lessons.leetcode.hash_table;

import java.util.HashMap;

/**
 * Ready
 * <a href="https://leetcode.com/problems/first-letter-to-appear-twice/description/">...</a>
 */
public class FirstLetterToAppearTwice2351Java {

    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] array = s.toCharArray();
        for (char key : array) {
            map.put(key, map.getOrDefault(key, 0) + 1);
            if (map.get(key) > 1) return key;
        }
        return '-';
    }
}
