package com.lessons.leetcode.binary_search;

public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {
        // Начальный индекс
        int start = 0;
        // Конечный индекс
        int end = nums.length - 1;
        // Найден ли элемент в массиве?
        boolean isFind = false;
        // Найденный индекс, нужен для отправки
        int find = 0;
        // Проверяем, что начальный индекс меньше, либо равно конечному. Условие выхода
        while (start <= end) {
            // Находим индекс середины в массиве
            int mid = (start + end) / 2;
            // Проверяем, что значение середины массива совпадает с target. Если повезёт, может будет O(1)
            if (nums[mid] == target) {
                // Элемент найден в массиве, делаем isFind = true
                isFind = true;
                // Найденный индекс массива
                find = mid;
                // Нашли элемент и резко выходим из цикла
                break;
                // Проверяем, что target больше значения середины массива
            } else if (nums[mid] < target) {
                // Если так, то начало массива будет уже с середины + 1
                start = mid + 1;
            } else {
                // Иначе конец массива будет уже с середины - 1
                end = mid - 1;
            }
        }

        // Если найдено, то отправляем результат, иначе ищем место в массиве, где поместили бы этот элемент
        if (isFind) {
            // Возвращаем индекс, когда target найден
            return find;
        } else {
            // Если target больше всех элементов в массиве, то он находился бы в конце
            if (target > nums[nums.length - 1]) return nums.length;
            // Если target меньше первого, то по любому будет в начальном индексе
            if (target < nums[0]) return 0;
            // Ищем промежуток меньше < target < больше
            for (int i = 0, k = 1; i < nums.length; i++, k++) {
                if (nums[i] < target && target < nums[k]) {
                    // Возвращаем индекс массива, когда target не найден в нём
                    return ++i;
                }
            }
        }
        // Если не найдём, то возвращаем -1
        return -1;
    }
}
