package com.lessons.leetcode.hash_table

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        map[target - nums[i]]?.let { index ->
            return intArrayOf(i, index)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}
