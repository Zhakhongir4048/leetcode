package com.lessons.leetcode.two_pointers;

/**
 * Ready
 * <a href="https://leetcode.com/problems/merge-strings-alternately/description/">...</a>
 */
public class MergeStringsAlternately1768Java {

    public String mergeAlternately(String word1, String word2) {
        char[] merged = new char[word1.length() + word2.length()];

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        int pointer1 = 0;
        int pointer2 = 0;

        for (int i = 0; i < merged.length; ) {
            if (pointer1 < chars1.length) {
                merged[i] = chars1[pointer1++];
                i++;
            }
            if (pointer2 < chars2.length) {
                merged[i] = chars2[pointer2++];
                i++;
            }
        }
        return new String(merged);
    }
}
