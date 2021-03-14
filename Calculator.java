package ArabicAndRomanCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Объявляем переменные
        String text = "Здравствуйте! Введите выражение для вычисления.\nАрабские числа от 1 до 10 или римские от I до X.\nНе забывайте, что в римских нету отрицательных чисел '-X'\nПример: 10 + 10 или X - I";
        String error = "Вы ошиблись!\nПроверьте пробелы между числами.\nАрабские числа от 1 до 10 или римские от I до X.\nНе забывайте, что в римских нету отрицательных чисел '-X'\nПример: 10 + 10 или X - I";
        String str;
        int err = -1;

        // Выводим текст приветсвия и с просьбой ввода выражения для вычисления.
        System.out.println(text);

        // Все выражение вписали в строку "str"
        str = reader.readLine();
        // Строку str полностью раскидали по символам
        char[] array = str.toCharArray();

        // Создаем массив арабских чисел от 1 до 9
        ArrayList<Character> numsArabian = new ArrayList<>();
        numsArabian.add('1');
        numsArabian.add('2');
        numsArabian.add('3');
        numsArabian.add('4');
        numsArabian.add('5');
        numsArabian.add('6');
        numsArabian.add('7');
        numsArabian.add('8');
        numsArabian.add('9');

        // Создаем массив римских чисел от I, V, X
        ArrayList<Character> numsRoman = new ArrayList<>();
        numsRoman.add('I');
        numsRoman.add('V');
        numsRoman.add('X');

        // Делаем первичную проверку первого символа в нашей строке на наличие арабского числа или римского,
        // если нету таких, то вывод "error" с просьбой ввести выражение верно!
        // Если первый символ арабский, то запуск программы в классе "Arabian"
        // Если первый исмвол римский, то запуск программы в классе "Roman"
        for (int i = 0; i <= 8; i++) {
            if (array[0] == numsArabian.get(i)) {
                ArabicAndRomanCalculator.Arabian.ArabianString(str);
                err = 1;
            }
        }
        for (int i = 0; i <= 2; i++) {
            if (array[0] == numsRoman.get(i)) {
                Roman.RomanString(str);
                err = 1;
            }
        }
        // Вывод ошибка с просьбой ввести выражение верно,
        // если не одно из условии для циклов не подошло!
        if (err < 0) {
            System.out.println(error);
        }
    }
}

