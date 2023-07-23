package com.lessons.leetcode.binary_search;

/**
 * <a href="https://leetcode.com/problems/guess-number-higher-or-lower/description/">...</a>
 */
public class GuessNumber {

    private final GuessGameApi guessGameApi = new GuessGame();

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = (right + left) / 2;
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
        System.out.println(new GuessNumber().guessNumber(100));
    }

}