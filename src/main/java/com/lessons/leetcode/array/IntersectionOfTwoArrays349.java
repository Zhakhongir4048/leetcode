package com.lessons.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Ready
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays/description/">...</a>
 */
public class IntersectionOfTwoArrays349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int[] result;

        for (int e : nums1)
            set1.add(e);

        for (int e : nums2)
            if (set1.contains(e))
                set2.add(e);

        result = new int[set2.size()];
        int i = 0;

        for (int c : set2) {
            result[i] = c;
            i++;
        }

        return result;
    }
}
