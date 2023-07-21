package com.lessons.leetcode.binary_search;

public class Solution {

    private final GuessGameApi guessGameApi = new GuessGame();

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = guessGameApi.guess(mid);
            if (res == 0)
                return mid;
            else if (res > 0)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().guessNumber(100));
    }

}