### Решение. 1 подход
```
char[] merged = new char[word1.length() + word2.length()];
```
Создается массив char размером, равным сумме длин word1 и word2. Это необходимо, чтобы вместить все символы из обеих строк.
```
char[] chars1 = word1.toCharArray();
char[] chars2 = word2.toCharArray();
```
Каждая строка переводится в массив символов для удобного доступа к отдельным символам.
```
int pointer1 = 0;
int pointer2 = 0;
```
Используются два указателя (pointer1 и pointer2) для отслеживания текущих индексов в каждом массиве символов.
```
        for (int i = 0; i < merged.length; ) {
            if (pointer1 < chars1.length) {
                merged[i] = chars1[pointer1++];
                i++;
            }
            if (pointer2 < chars2.length) {
                merged[i] = chars2[pointer2++];
                i++;
            }
        }
```
Цикл for выполняется до тех пор, пока не будет создана полная строка merged.
Проверяется, можно ли добавить символ из первого массива. Если это возможно, символ добавляется в merged, а указатель увеличивается.
Затем делается то же самое для второго массива.
```
return new String(merged);
```
В конце, созданный массив символов merged преобразуется обратно в строку и возвращается.
### Пример работы:
Solution solution = new Solution();
String result = solution.mergeAlternately("abc", "1234");
Результат будет "a1b2c34".
### Решение
## Java
```
    public String mergeAlternately(String word1, String word2) {
        char[] merged = new char[word1.length() + word2.length()];

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        int pointer1 = 0;
        int pointer2 = 0;

        for (int i = 0; i < merged.length; ) {
            if (pointer1 < chars1.length) {
                merged[i] = chars1[pointer1++];
                i++;
            }
            if (pointer2 < chars2.length) {
                merged[i] = chars2[pointer2++];
                i++;
            }
        }
        return new String(merged);
    }
```
## Kotlin
```
class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val merged = CharArray(word1.length + word2.length)
        val chars1 = word1.toCharArray()
        val chars2 = word2.toCharArray()

        var pointer1 = 0
        var pointer2 = 0

        var i = 0
        while (i < merged.size) {
            if (pointer1 < chars1.size) {
                merged[i++] = chars1[pointer1++]
            }
            if (pointer2 < chars2.size) {
                merged[i++] = chars2[pointer2++]
            }
        }
        return merged.concatToString()
    }
}
```
### Решение. 2 подход
```
StringBuilder builder = new StringBuilder();
```
Создается объект StringBuilder, который эффективно собирает строку. Это предпочтительный метод для конкатенации строк, так как он менее затратный с точки зрения памяти и времени.
```
while (p1 < word1Ar.length && p2 < word2Ar.length) {
       builder.append(word1Ar[p1++]);
       builder.append(word2Ar[p2++]);
}
```
while цикл продолжается до тех пор, пока оба указателя не выйдут за границы своих массивов. Внутри цикла символы добавляются в StringBuilder поочередно из обоих массивов.
```
while (p1 < word1Ar.length) {
       builder.append(word1Ar[p1++]);
}
```
Обработка оставшихся символов из word1:
Если один массив еще содержит символы после завершения основного цикла, они добавляются в builder.
```
while (p2 < word2Ar.length) {
       builder.append(word2Ar[p2++]);
}
```
Обработка оставшихся символов из word2:
Аналогично, оставшиеся символы из второго массива добавляются.
```
return builder.toString();
```
В конце метод возвращает объединенную строку, созданную StringBuilder.
### Решение
## Java
```
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        char[] word1Ar = word1.toCharArray();
        char[] word2Ar = word2.toCharArray();
        int p1 = 0;
        int p2 = 0;
        while (p1 < word1Ar.length && p2 < word2Ar.length) {
            builder.append(word1Ar[p1++]);
            builder.append(word2Ar[p2++]);
        }

        while (p1 < word1Ar.length) {
            builder.append(word1Ar[p1++]);
        }

        while (p2 < word2Ar.length) {
            builder.append(word2Ar[p2++]);
        }

        return builder.toString();
    }
}
```
## Kotlin
```
class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val builder = StringBuilder()
        val chars1 = word1.toCharArray()
        val chars2 = word2.toCharArray()

        var pointer1 = 0
        var pointer2 = 0

        while (pointer1 < chars1.size && pointer2 < chars2.size) {
            builder.append(chars1[pointer1++])
            builder.append(chars2[pointer2++])
        }

        while (pointer1 < chars1.size) {
            builder.append(chars1[pointer1++])
        }

        while (pointer2 < chars2.size) {
            builder.append(chars2[pointer2++])
        }

        return builder.toString()
    }
}
```