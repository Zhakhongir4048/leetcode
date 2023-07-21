package com.lessons.leetcode.binary_search;

public class GuessGame implements GuessGameApi {

    int pick = 6;

    @Override
    public int guess(int num) {
        return Integer.compare(num, pick);
    }

}