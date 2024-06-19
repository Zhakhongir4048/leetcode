package com.lessons.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        // ~
        int var = 121; // двоичный вид: 00000000 00000000 00000000 01111001
        int not_v = ~var; // двоичный вид: 11111111 11111111 11111111 10000110 (число -122) 7 младших бит 0000110 -> 121 + 1
        System.out.println(not_v); // - 121

        // &
        byte flags = 5; // 00000101
        byte mask = 4; // 00000100

        System.out.println(flags & mask); // 00000100 число 4

        byte f = 13; // 00001101
        byte m = 5; // 00000101

        System.out.println((byte) (f & ~m)); // двоичная запись результат = 00001000, число 8

        // |
        byte j = 8; // 00001000
        byte i = 5; // 00000101

        System.out.println((byte) (j | i)); // 00001101 число 13

        // ^ XOR, переключение бита, при XOR не происходит потери данных
        byte k = 9; // 00001001
        byte d = 1; // 00000001

        byte x = (byte) (k ^ d);
        System.out.println(x); // 00001000 (число 8)
        System.out.println(x ^ d); // 00001001 (число 9)


        String[] messages =
                {"Сегодня в #ПИТЕР идет #ДОЖДЬ",
                        "Вчера в #москва был #дождь",
                        "Сегодня в #МОСКВА хорошая погода",
                        "Завтра приеду в #Москва"
                };

        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (String message : messages) {
            String[] split = message.split(" ");
            for (String str : split) {
                if (str.startsWith("#")) {
                    result.add(builder.append(str).reverse().toString());
                    builder.delete(0, builder.length());
                }
            }
        }
        System.out.println(result);

        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        reverseWords("Let's take LeetCode contest");
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 == 1) return false;
        return isPowerOfTwo(n / 2);
    }


    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> morseMap = new HashMap<>(26);
        morseMap.put('a', ".-");
        morseMap.put('b', "-...");
        morseMap.put('c', "-.-.");
        morseMap.put('d', "-..");
        morseMap.put('e', ".");
        morseMap.put('f', "..-.");
        morseMap.put('g', "--.");
        morseMap.put('h', "....");
        morseMap.put('i', "..");
        morseMap.put('j', ".---");
        morseMap.put('k', "-.-");
        morseMap.put('l', ".-..");
        morseMap.put('m', "--");
        morseMap.put('n', "-.");
        morseMap.put('o', "---");
        morseMap.put('p', ".--.");
        morseMap.put('q', "--.-");
        morseMap.put('r', ".-.");
        morseMap.put('s', "...");
        morseMap.put('t', "-");
        morseMap.put('u', "..-");
        morseMap.put('v', "...-");
        morseMap.put('w', ".--");
        morseMap.put('x', "-..-");
        morseMap.put('y', "-.--");
        morseMap.put('z', "--..");

        StringBuilder sb = new StringBuilder();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (int j = 0; j < word.length; j++) {
                sb.append(morseMap.get(word[j]));
            }
            set.add(sb.toString());
            sb.delete(0, sb.length());
        }

        return set.size();
    }

    public int missingNumber(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int e : nums)
            queue.add(e);

        boolean isZero = queue.contains(0);

        if (queue.size() == 1) {
            if (queue.peek() == 1) return 0;
            else return queue.poll() + 1;
        }

        while (!queue.isEmpty()) {
            Integer current = queue.poll();
            Integer next = queue.peek();

            if (next != null) {
                if (next - current != 1) return current + 1;
            } else {
                if (isZero) {
                    return current + 1;
                } else {
                    return 0;
                }
            }
        }

        return -1;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // m - длина nums1 и n = длина nums2
        // нужно в nums1 делать окончательный результат
        // nums1 имеет длину m + n, где первые m элементов обозначают элементы, которые должны быть объединены,
        // а последние n элементов устанавливаются в 0 и должны игнорироваться.


        // 1, 2, 3
        for (int i = m, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        String[] reverse = sb.toString().split(" ");

        for (int i = reverse.length - 1; i >= 0; i--) {
            if (i == 0) {
                result.append(reverse[i]);
            } else {
                result.append(reverse[i]).append(" ");
            }
        }


        return result.toString();
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int length = candies.length;
        List<Boolean> result = new ArrayList<>(length);
        TreeSet<Integer> sort = new TreeSet<>();
        for (int candy : candies) {
            sort.add(candy);
        }

        int last = sort.last();

        for (int i = 0; i < length; i++) {
            int find = candies[i] + extraCandies;
            if (find >= last)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }


}
