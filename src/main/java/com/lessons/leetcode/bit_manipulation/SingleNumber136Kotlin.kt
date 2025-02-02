package com.lessons.leetcode.bit_manipulation

class SingleNumber136Kotlin {

    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (i in nums) {
            result = result.xor(i)
        }
        return result
    }
}