package com.lessons.leetcode.sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * Ready
 * <a href="https://leetcode.com/problems/minimum-window-substring/description/">...</a>
 */
public class MinimumWindowSubstring76 {
    public String minWindow(String s, String t) {
        // Map считает кол-во символов, которые есть в t.
        // Map будет использоваться при добавлении/удалении элемента. Чтобы следить за количеством символом.
        Map<Character, Integer> countCharMap = new HashMap<>();
        for (char c : t.toCharArray())
            countCharMap.put(c, countCharMap.getOrDefault(c, 0) + 1);

        int minLen = Integer.MAX_VALUE;
        // Начальный индекс подстроки, который надо будет вернуть.
        // Она будет меняться, т.к. нужно найти минимальную подстроку.
        int minStart = 0;

        // Счётчик. Правым pointer-ом уменьшаем счётчик, левым увеличиваем.
        // Если счётчик равен 0, значит нужная подстрока нашлась. Левым будем идти дальше вправо.
        int matchCounter = countCharMap.size();

        // 2 pointers, будет идти правым, догонять левым
        int left = 0, right = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            if (countCharMap.containsKey(r)) {
                // Очень важно сделать именно так, потому, что одинаковые символы могут быть в t
                countCharMap.put(r, countCharMap.get(r) - 1);
                // Когда уже достигнуто 0, значит нашли символы все повторяющиеся
                if (countCharMap.get(r) == 0) {
                    matchCounter--;
                }
            }
            right++;

            // Нашли подстроку!
            while (matchCounter == 0) {
                char l = s.charAt(left);
                // Так находим минимальную подстроку
                if (right - left < minLen) {
                    // Минимальная длина
                    minLen = right - left;
                    // min beginIndex for substring
                    minStart = left;
                }

                if (countCharMap.containsKey(l)) {
                    // Уходим вправо, чтобы дальше идти, искать меньшие подстроки
                    countCharMap.put(l, countCharMap.get(l) + 1);
                    if (countCharMap.get(l) > 0) {
                        // Левый pointer нашёл нужную букву. Выходим из цикла
                        matchCounter++;
                    }
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
