### Решение. 1 подход

```
HashMap<Integer, Integer> map = new HashMap<>();
```
Здесь вы инициализируете новый HashMap, который будет хранить пары "значение – индекс". Ключом будет число из массива nums, а значением — его индекс.
```
for (int i = 0; i < nums.length; i++) {
```
Вы начинаете цикл, который проходит по каждому элементу массива nums.
```
if (map.containsKey(target - nums[i])) {
       return new int[]{i, map.get(target - nums[i])};
   }
```
В этом условии вы проверяете, есть ли в map элемент, который в сумме с текущим элементом nums[i] даст значение target. Если такой элемент найден, вы возвращаете массив, состоящий из текущего индекса i и индекса найденного элемента.
```
map.put(nums[i], i);
```
Если необходимая пара не найдена, вы добавляете элемент nums[i] в map с его индексом i как значением.
```
return new int[]{};
```
Если по завершении цикла не была найдена пара чисел, сумма которых составляет target, метод возвращает пустой массив.

### Пример работы:

Предположим, у вас есть массив:
```
int[] nums = {2, 7, 11, 15};
int target = 9;
```
При i = 0 (значение nums[0] = 2), target - nums[i] = 7. map не содержит 7, добавляем map.put(2, 0).

При i = 1 (значение nums[1] = 7), target - nums[i] = 2. Теперь map содержит 2, и вы возвращаете {1, 0}.
Таким образом, данный код эффективно находит индексы двух чисел, сумма которых равна target, используя пространство O(n) для хранения элементов.

### Решение
## Java
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { i, map.get(target - nums[i]) };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
```

## Kotlin
```
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            map[target - nums[i]]?.let { index ->
                return intArrayOf(i, index)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}
```