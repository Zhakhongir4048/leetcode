package com.lessons.leetcode.array;

/**
 * Ready
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">...</a>
 */
public class RemoveDuplicatesFromSortedArray26 {

    /**
     * Правый pointer всегда идёт вправо, сравнивая между собой текущий и следующий элемент.
     * Нужно найти максимальный правый повторяемый элемент и переместить его влево.
     * Когда текущий и следующий элемент не равны, значит нашли максимальный правый повторяемый элемент.
     * Тогда увеличиваем counter на 1.
     * p1 всегда 1, потому, что один уникальный элемент есть всегда.
     */
    public static int test(int[] nums) {
        int p1 = 1;
        for (int p2 = 1; p2 < nums.length; p2++) {
            if (nums[p2] != nums[p2 - 1]) {
                nums[p1] = nums[p2];
                p1++;
            }
        }
        return p1;
    }
}
