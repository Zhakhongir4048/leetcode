### Решение. 1 подход
```
int left = 0;
int right = s.length() - 1;
char[] array = s.toCharArray();
```
Здесь мы инициализируем два указателя:
left указывает на начало строки (индекс 0).
right указывает на конец строки (индекс s.length() - 1).

Затем мы преобразуем строку s в массив символов array для более удобного доступа.
```
while (left <= right)
```
Мы используем цикл while, который продолжается, пока указатель left меньше или равен указателю right. Это позволяет нам проверять символы от концов строки к ее центру.
```
if (!Character.isLetterOrDigit(array[left])) {
       left++;
   } else if (!Character.isLetterOrDigit(array[right])) {
       right--;
   }
```
Внутри цикла мы сначала проверяем символ, на который указывает left. Если он не является буквенным или цифровым символом (то есть не проходит проверку Character.isLetterOrDigit), мы просто увеличиваем left, чтобы перейти к следующему символу.
Аналогично, если символ, на который указывает right, не является буквенным или цифровым, мы уменьшаем right.
```
else if (Character.toLowerCase(array[left]) != Character.toLowerCase(array[right])) {
       return false;
   }
```
На этом этапе оба указателя left и right указывают на допустимые символы. Мы сравниваем символы, при этом приводя их к нижнему регистру с помощью Character.toLowerCase(). Если символы не равны, это означает, что строка не является палиндромом, и функция возвращает false.
```
else {
       left++;
       right--;
   }
```
Если символы равны, оба указателя перемещаются к центру: left увеличивается, а right уменьшается, и цикл продолжается.
```
return true;
```
Если цикл завершается, не найдя различий между символами, это свидетельствует о том, что строка является палиндромом, и метод возвращает true.

### Пример работы:
Рассмотрим строку "A man, a plan, a canal: Panama":

Изначально:

left указывает на 'A' (индекс 0)
right указывает на 'a' (индекс 30)

Первый проход:

'A' и 'a' равны (игнорируя регистр).
Указатели перемещаются: left теперь указывает на пробел (индекс 1), right на 'm'.

Второй проход:

Пропускаем пробел: left становится 2.
Проверяем 'm' и 'm': совпадают.
Указатели перемещаются дальше.

Процесс продолжается, пока left не превысит right.
### Решение
## Java
```
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] array = s.toCharArray();

        while (left <= right) {
            if (!Character.isLetterOrDigit(array[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(array[right])) {
                right--;
            } else if (Character.toLowerCase(array[left]) != Character.toLowerCase(array[right])) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
```
## Kotlin
```
class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        val array = s.toCharArray();
        while (left <= right) {
            if (!array[left].isLetterOrDigit()) {
                left++
            } else if (!array[right].isLetterOrDigit()) {
                right--
            } else if (array[left].lowercaseChar() != array[right].lowercaseChar()) {
                return false
            } else {
                left++
                right--
            }
        }
        return true
    }
}
```

### Решение. 2 подход
Аналогичен 1 подходу,  Только уходим от Character класса.
Метод isLetterOrDigit(char c)
Недостатки - подходит только для английского алфавита
Этот метод проверяет, является ли символ буквой или цифрой:
```
    public boolean isLetterOrDigit(char c) {
        return (((c >= '0') && (c <= '9')) || (c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z'));
    }
```
Метод toLowerCase(char c)
Этот метод преобразует символ в нижний регистр, если он находится в верхнем регистре:
```
    public static char toLowerCase(char c) {
        return (c >= 'A' && c <= 'Z') ? (char) ('a' + (c - 'A')) : c;
    }
```
### Решение
## Java
```
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] array = s.toCharArray();

        while (left <= right) {
            if (!isLetterOrDigit(array[left])) {
                left++;
            } else if (!isLetterOrDigit(array[right])) {
                right--;
            } else if (toLowerCase(array[left]) != toLowerCase(array[right])) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public boolean isLetterOrDigit(char c) {
        return (((c >= '0') && (c <= '9')) || (c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z'));
    }

    public static char toLowerCase(char c) {
        return (c >= 'A' && c <= 'Z') ? (char) ('a' + (c - 'A')) : c;
    }
}
```
## Kotlin
```
class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        val array = s.toCharArray();
        while (left <= right) {
            if (!isLetterOrDigit(array[left])) {
                left++
            } else if (!isLetterOrDigit(array[right])) {
                right--
            } else if (toLowerCase(array[left]) != toLowerCase(array[right])) {
                return false
            } else {
                left++
                right--
            }
        }
        return true
    }

    private fun isLetterOrDigit(c: Char): Boolean =
        (((c >= '0') && (c <= '9')) || (c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z'))

    private fun toLowerCase(c: Char): Char {
        if (c in 'A'..'Z') {
            return 'a' + (c - 'A')
        }
        return c
    }
}
```