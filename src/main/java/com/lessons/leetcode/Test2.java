package com.lessons.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test2 {
    public static String minWindow(String s, String t) {
        if (s.equals(t)) return s;

        if (t.length() == 1) {
            for (char c : s.toCharArray()) {
                if (c == t.charAt(0)) return String.valueOf(c);
            }
        }

        if (s.contains(t)) {
            int i = s.indexOf(t);
            return s.substring(i, i + t.length());
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        int left = 0;

        char[] array = s.toCharArray();

        List<String> stringList = new ArrayList<>();

        for (int right = 0; right < array.length; right++) {
            mapS.put(array[right], mapS.getOrDefault(array[right], 0) + 1);

            // Тут уже больше кол-во, чем нужно
            while (mapT.containsKey(array[right]) && mapT.get(array[right]) < mapS.get(array[right])) {
                mapS.put(array[left], mapS.get(array[left]) - 1);
                if (mapS.get(array[left]) == 0) {
                    mapS.remove(array[left]);
                }
                left++;
            }

            if (mapS.entrySet().containsAll(mapT.entrySet())) {
                stringList.add(s.substring(left, right + 1));

                do {
                    mapS.put(array[left], mapS.get(array[left]) - 1);
                    if (mapS.get(array[left]) == 0) {
                        mapS.remove(array[left]);
                    }
                    left++;
                } while (!mapT.containsKey(array[left]));
                if (mapS.entrySet().containsAll(mapT.entrySet())) stringList.add(s.substring(left, right + 1));
            }
        }

        if (!stringList.isEmpty()) {
            String shortest = stringList.get(0);
            for (String str : stringList) {
                if (str.length() < shortest.length()) {
                    shortest = str;
                }
            }
            return shortest;
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(minWindow("ab", "b"));
        System.out.println(minWindow("ba", "a"));
        System.out.println(minWindow("abc", "ab"));
        System.out.println(minWindow("acbbaca", "aba"));
//         cabwe, fgewcwa, cwae
        System.out.println(minWindow("cabwefgewcwaefgcf", "cae"));
    }
}
