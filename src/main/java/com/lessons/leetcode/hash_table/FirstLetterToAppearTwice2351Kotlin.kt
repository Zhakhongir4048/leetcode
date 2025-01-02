package com.lessons.leetcode.hash_table

class FirstLetterToAppearTwice2351Kotlin {

    fun repeatedCharacter(s: String): Char {
        val map = mutableMapOf<Char, Int>()
        val array = s.toCharArray()
        for (key in array) {
            map[key] = map.getOrDefault(key, 0) + 1
            map[key]?.let { count ->
                if (count > 1) {
                    return key
                }
            }
        }
        return '-'
    }
}
