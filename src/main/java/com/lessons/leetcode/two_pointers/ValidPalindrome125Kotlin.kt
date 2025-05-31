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

    private fun isLetterOrDigit(source: Char): Boolean =
        (source in 'A'..'Z') || (source in 'a'..'z') || (source in '0'..'9');

    private fun toLowerCase(c: Char): Char {
        if (c in 'A'..'Z') {
            return 'a' + (c - 'A')
        }
        return c
    }
}
