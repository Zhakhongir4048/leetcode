package com.lessons.leetcode.two_sum;

public class MySolution {

  /**
   * @param nums   массив, в котором будем искать индексы двух чисел для суммы (target)
   * @param target сумма, которую ищем в массиве
   * @return возвращаем массив, в котором индексы, составляющую сумму target либо пустой массив
   */
  public static int[] twoSum(int[] nums, int target) {
    int[] result;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 1; j < nums.length; j++) {
        if (nums[i] == nums[j] && i == j) {
          continue;
        }
        if (nums[i] + nums[j] == target) {
          result = new int[]{i, j};
          return result;
        }
      }
    }
    return new int[]{};
  }

}