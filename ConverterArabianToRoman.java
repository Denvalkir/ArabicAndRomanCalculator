package ArabicAndRomanCalculator;

import java.util.ArrayList;

public class ConverterArabianToRoman {
    public static String ConverterArabicToRoman(Integer num) {
        // Создали массив и инициализировали его от 1 до 100
        String error = "В римских числах нету отрицательных чисех, а значит и ответ не может быть отрицательным!";
        ArrayList<String> list = new ArrayList<>();

        list.add("0");

        list.add("I");
        list.add("II");
        list.add("III");
        list.add("IV");
        list.add("V");
        list.add("VI");
        list.add("VII");
        list.add("VIII");
        list.add("IX");
        list.add("X");

        list.add("XI");
        list.add("XII");
        list.add("XIII");
        list.add("XIV");
        list.add("XV");
        list.add("XVI");
        list.add("XVII");
        list.add("XVIII");
        list.add("XIX");
        list.add("XX");

        list.add("XXI");
        list.add("XXII");
        list.add("XXIII");
        list.add("XXIV");
        list.add("XXV");
        list.add("XXVI");
        list.add("XXVII");
        list.add("XXVIII");
        list.add("XXIX");
        list.add("XXX");

        list.add("XXXI");
        list.add("XXXII");
        list.add("XXXIII");
        list.add("XXXIV");
        list.add("XXXV");
        list.add("XXXVI");
        list.add("XXXVII");
        list.add("XXXVIII");
        list.add("XXXIX");
        list.add("XL");

        list.add("XLI");
        list.add("XLII");
        list.add("XLIII");
        list.add("XLIV");
        list.add("XLV");
        list.add("XLVI");
        list.add("XLVII");
        list.add("XLVIII");
        list.add("XLIX");
        list.add("L");

        list.add("LI");
        list.add("LII");
        list.add("LIII");
        list.add("LIV");
        list.add("LV");
        list.add("LVI");
        list.add("LVII");
        list.add("LVIII");
        list.add("LIX");
        list.add("LX");

        list.add("LXI");
        list.add("LXII");
        list.add("LXIII");
        list.add("LXIV");
        list.add("LXV");
        list.add("LXVI");
        list.add("LXVII");
        list.add("LXVIII");
        list.add("LXIX");
        list.add("LXX");

        list.add("LXXI");
        list.add("LXXII");
        list.add("LXXIII");
        list.add("LXXIV");
        list.add("LXXV");
        list.add("LXXVI");
        list.add("LXXVII");
        list.add("LXXVIII");
        list.add("LXXIX");
        list.add("LXXX");

        list.add("LXXXI");
        list.add("LXXXII");
        list.add("LXXXIII");
        list.add("LXXXIV");
        list.add("LXXXV");
        list.add("LXXXVI");
        list.add("LXXXVII");
        list.add("LXXXVIII");
        list.add("LXXXIX");
        list.add("XC");

        list.add("XCI");
        list.add("XCII");
        list.add("XCIII");
        list.add("XCIV");
        list.add("XCV");
        list.add("XCVI");
        list.add("XCVII");
        list.add("XCVIII");
        list.add("XCIX");
        list.add("C");

        // Входящая арабская цифра конвертируется на римскую
        // И возвращается обратно
        if (num < 0) {
            return error;
        } else {
            return list.get(num);
        }
    }
}


