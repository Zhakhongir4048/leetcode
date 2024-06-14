package com.lessons.leetcode.array;

/**
 * Ready
 * <a href="https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/description/">...</a>
 */
public class CheckIfStringIsAPrefixOfArray1961 {

    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String find : words) {
            if (s.contentEquals(sb)) return true;
            if (s.contains(find)) sb.append(find);
            else return false;
        }
        return s.contentEquals(sb);
    }
}
