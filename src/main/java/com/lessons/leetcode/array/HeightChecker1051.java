package com.lessons.leetcode.array;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Ready
 * <a href="https://leetcode.com/problems/height-checker/description/">...</a>
 */
public class HeightChecker1051 {

    public int heightChecker(int[] heights) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int key : heights) {
            queue.add(key);
        }
        int count = 0;
        for (int height : heights) if (queue.poll() != height) count++;
        return count;
    }
}
