package com.lessons.leetcode.sliding_window;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/">...</a>
 * 5 m 35 s
 */
public class MaximumLengthSubstringWithTwoOccurrences {

    /**
     * Пример: String s = "bcbbbcba".
     * Логика: Добавляем элементы правым pointer-ом, а удаляем левым. Проверяем на совпадение именно правым pointer-ом.
     * Левый pointer преследует правый pointer. Нужно, чтобы левый pointer преследовал именно в цикле, потому, что
     * если будет 4 совпадений подряд, и был бы один if, то только один элемент удалили бы. Осталось бы 3 совпадений
     * в итоге, и левый pointer отстал бы от правого.
     * Есть проверка того, что 2 совпадения букв в подстроке.
     * Итерации:
     * b -> bc -> bcb -> (добавляется новая b, удаляется первая b) cbb -> bbb (будет удаляться первая b) ->
     * bbc -> bcba (Тут ничего удаляться не будет и ответ будет 4)
     * Ответ: 4
     */
    public static int maximumLengthSubstring(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        int l = 0;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < n; r++) {
            map.put(a[r], map.getOrDefault(a[r], 0) + 1);
            while (map.get(a[r]) > 2) {
                map.put(a[l], map.get(a[l]) - 1);
                if (map.get(a[l]) == 0) {
                    map.remove(a[l]);
                }
                l++;
            }
            count = Math.max(count, r - l + 1);
        }
        return count;
    }
}
