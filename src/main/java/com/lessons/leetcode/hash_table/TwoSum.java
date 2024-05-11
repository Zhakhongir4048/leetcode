package com.lessons.leetcode.hash_table;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @link <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[]{j - i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSum2(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        HashMap<String, Integer> map2 = new LinkedHashMap<>();
        int sum = 0;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }
        for (Map.Entry<String, Integer> value : map.entrySet()) {
            if (map2.containsKey(value.getKey())) {
                if (result.isEmpty()) {
                    sum = map2.get(value.getKey()) + value.getValue();
                    result.add(value.getKey());
                } else {
                    int i = map2.get(value.getKey()) + value.getValue();
                    String key = result.get(0);
                    if (map2.containsKey(key) && map.containsKey(key)) {
                        int j = map.get(key) + map2.get(key);
                        if (j > i) {
                            result.remove(0);
                        }
                    }
                    if (i <= sum) {
                        result.add(value.getKey());
                    }
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(findRestaurant(
                        new String[]{"Shogun", "Piatti", "Tapioca Express", "Burger King", "KFC"},
                        new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}
                ))
//                0 + 1 = 1
//                2 + 2 = 4
//                0 + 3 = 3
        );
    }
}
