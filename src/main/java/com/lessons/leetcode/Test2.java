package com.lessons.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        // O(N*M)
        // O(1)
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int del = nums2[j] * k;
                if (nums1[i] >= del && nums1[i] % del == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int findPermutationDifference(String s, String t) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arT = t.toCharArray();
        for (int i = 0; i < arT.length; i++) {
            map.put(arT[i], i);
        }
        char[] arS = s.toCharArray();
        for (int i = 0; i < arS.length; i++) {
            result += Math.abs(i - map.get(arS[i]));
        }
        return result;
    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int l = 0, r = 0; r < array.length; r++) {
            map.put(array[r], map.getOrDefault(array[r], 0) + 1);
            while (map.get(array[r]) > 1) {
                char key = array[l];
                Integer value = map.get(key);
                map.put(key, value - 1);
                if (value == 0)
                    map.remove(key);
                l++;
            }
            count = Math.max(count, (r - l) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }
}
