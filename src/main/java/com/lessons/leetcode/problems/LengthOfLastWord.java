package com.lessons.leetcode.problems;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                result++;
            else if (result > 0)
                return result;
        }
        return result;
    }

}