package com.lessons.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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
}
