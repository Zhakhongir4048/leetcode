package com.lessons.leetcode.binary_search;

/**
 * <a href="https://leetcode.com/problems/search-a-2d-matrix/description/">...</a>
 */
public class SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int lengthColumn = matrix[i].length - 1;
            // Finding that row.
            if (target <= matrix[i][lengthColumn]) {
                // Binary Search
                int left = 0;
                int right = lengthColumn;
                while (left <= right) {
                    int mid = (right + left) / 2;
                    if (matrix[i][mid] == target)
                        return true;
                    else if (matrix[i][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(matrix, 60));
    }

}