package com.lessons.leetcode;

import java.util.HashMap;

public class Test2 {
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        int left = 0;

        char[] array = s.toCharArray();

        int count = 0;

        for (int right = 0; right < array.length; right++) {
            mapS.put(array[right], mapS.getOrDefault(array[right], 0) + 1);

            if (mapS.entrySet().containsAll(mapT.entrySet())) {
                count = Math.max(count, right - left + 1);
                mapS.put(array[left], mapS.get(array[left]) - 1);
                if (mapS.get(array[left]) == 0) {
                    mapS.remove(array[left]);
                }
                left++;

                while (!mapT.containsKey(array[left])) {
                    mapS.put(array[left], mapS.get(array[left]) - 1);
                    if (mapS.get(array[left]) == 0) {
                        mapS.remove(array[left]);
                    }
                    left++;
                }
            }
        }

        System.out.println(count);

        return "";
    }

    public static void main(String[] args) {
        minWindow("ADOBECODEBANC", "ABC");
    }
}
