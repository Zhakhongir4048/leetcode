package com.lessons.leetcode.ready;

/**
 * Учитывая две строки ransomNote и Magazine, верните true, если ransomNote можно создать с
 * использованием букв из журнала, и false в противном случае.
 * Каждое письмо в журнале можно использовать только один раз в выкупе. Примечание.
 * <a href="https://leetcode.com/problems/ransom-note/">...</a>
 */
public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Нет смысла проверять дальше, потому, что букв не хватит для журнала (ransomNote)
        if (ransomNote.length() > magazine.length()) return false;
        // В английском алфавите 26 букв
        int[] alphabetCounter = new int[26];
        // Складываем все буквы из журнала в массив alphabetCounter. То есть, если две буквы а,
        // то ячейка массива [0] = 2
        for (char c : magazine.toCharArray())
            // Вот так складывается в ячейку
            alphabetCounter[c - 'a']++;
        // Проходимся по журналу массива и сравниваем что эти буквы есть в alphabetCounter
        // Проверяем, хватает ли нам, кол-во букв для журнала из магазина
        for (char c : ransomNote.toCharArray()) {
            // Тут проверяем что кол-во букв хватает для журнала из магазина
            if (alphabetCounter[c - 'a'] == 0) {
                return false;
            }
            // Вычитаем букву из alphabetCounter
            alphabetCounter[c - 'a']--;
        }
        // Возвращаем правду, все проверки пройдены успешно
        return true;
    }
}