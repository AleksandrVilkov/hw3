package org.example;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Метод возвращает подстроку максимальной длины в которой не повторяются символы
     * Если найдено несколько подстрок одинаковой длины - вернуть первую.
     *
     * Пример 1 вход= abcddcba, выход = abcd
     * Так как найдены две подстроки с неповторяющимися значениями:
     * 1) abcd
     * 2) dcba
     * Они динаковой длины, по этому возвращаем 1 строку
     *
     * Пример 2 вход= abcddcbaX, выход = dcbaX
     * Так как эта подстрока самая большая
     *
     * @param str входная не пустая строка
     * @return максимальная подстрока из уникальных значений
     * Сигнатуру метода не меняем
     */
    public String findMaxSubstring(String str) {
        var input = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        Set<String> strs = new LinkedHashSet<>();

        int pos = 0;
        while (pos < input.length - 1) {
            for (int i = pos; i < input.length; i++) {
                if (!map.containsKey(input[i])) {
                    map.put(input[i], i);
                } else {
                    pos = map.get(input[i]) + 1;
                    strs.add(getString(map.keySet()));
                    map.clear();
                    map.put(input[i], i);
                }
            }
        }
        strs.add(getString(map.keySet()));
        var result = "";
        for (String s : strs) {
            if (result.length() < s.length()) {
                result = s;
            }
        }
        return result;
    }

    private static String getString(Set<Character> ch) {
        var result = new StringBuilder();
        ch.forEach(result::append);
        return result.toString();
    }


    /**
     * Задача со зведочкой (опционально)
     * <br/>
     * Можно решать так же для английского алфавита, проверять что присутствуют буквы от A до Z хотя бы по одному разу.
     * <br/>
     * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
     *
     * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     * @see <a href="https://www.codewars.com/kata/545cedaa9943f7fe7b000048">https://www.codewars.com/kata/545cedaa9943f7fe7b000048</a>
     */
    public boolean check(String sentence){
        return false;
    }

}