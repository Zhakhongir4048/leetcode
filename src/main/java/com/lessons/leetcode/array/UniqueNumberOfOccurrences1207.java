package com.lessons.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Ready
 * <a href="https://leetcode.com/problems/unique-number-of-occurrences/description/">...</a>
 */
public class UniqueNumberOfOccurrences1207 {

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int k : arr)
            map.put(k, map.getOrDefault(k, 0) + 1);
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}
