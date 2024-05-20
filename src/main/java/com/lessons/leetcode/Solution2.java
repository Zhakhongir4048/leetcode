package com.lessons.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution2 {

    public static boolean checkInclusion(String s1, String s2) {
        int l = 0;
        char[] a = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>(); // s1. Мапа для первой строки. Символ и его кол-во
        HashMap<Character, Integer> map2 = new HashMap<>();

        // map = {a=1}, {b=2}
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        for (int r = 0; r < a2.length; r++) {
            map2.put(a2[r], map2.getOrDefault(a2[r], 0) + 1);
            if ((r - l + 1) >= a.length) {
                if (map.equals(map2)) {
                    return true;
                }
                map2.put(a2[l], map2.get(a2[l]) - 1);
                if (map2.get(a2[l]) == 0) {
                    map2.remove(a2[l]);
                }
                l++;
            }
        }

        return false;
    }

    public static int longestConsecutive(int[] nums) {
        // длина цифры, плюс его размер
        Map<Integer, TreeSet<Integer>> map = new HashMap<>();
        int count = 0;

        int reverse = 0;


        for (int i = 0; i < nums.length; i++) {

            while (nums[i] != 0) {
                reverse = reverse * 10 + nums[i] * 10 % 10;
                nums[i] /= 10;
            }

            TreeSet<Integer> orDefault = map.getOrDefault(String.valueOf(reverse).length(), new TreeSet<>());
            reverse = 0;
            orDefault.add(nums[i]);
            map.put(String.valueOf(nums[i]).length(), orDefault);
        }

        for (Map.Entry<Integer, TreeSet<Integer>> el : map.entrySet()) {
            count = Math.max(count, el.getValue().size());
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("adc", "dcda"));
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        System.out.println(longestConsecutive(new int[]{0, -1}));
    }
}


