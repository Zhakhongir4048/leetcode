package com.lessons.leetcode.two_pointers

class MergeStringsAlternately1768Kotlin {

    fun mergeAlternately(word1: String, word2: String): String {
        val merged = CharArray(word1.length + word2.length)
        val chars1 = word1.toCharArray()
        val chars2 = word2.toCharArray()

        var pointer1 = 0
        var pointer2 = 0

        var i = 0
        while (i < merged.size) {
            if (pointer1 < chars1.size) {
                merged[i++] = chars1[pointer1++]
            }
            if (pointer2 < chars2.size) {
                merged[i++] = chars2[pointer2++]
            }
        }
        return merged.concatToString()
    }
}