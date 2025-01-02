package com.lessons.leetcode.two_pointers

class ValidPalindrome125Kotlin {

    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        val array = s.toCharArray();
        while (left <= right) {
            if (!isLetterOrDigit(array[left])) {
                left++
            } else if (!isLetterOrDigit(array[right])) {
                right--
            } else if (toLowerCase(array[left]) != toLowerCase(array[right])) {
                return false
            } else {
                left++
                right--
            }
        }
        return true
    }

    private fun isLetterOrDigit(c: Char): Boolean =
        (((c >= '0') && (c <= '9')) || (c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z'))

    private fun toLowerCase(c: Char): Char {
        if (c in 'A'..'Z') {
            return 'a' + (c - 'A')
        }
        return c
    }
}
