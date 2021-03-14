package ArabicAndRomanCalculator;

public class Arabian {
    public static void ArabianString(String str) {
        // Объявлем переменные
        int a = -1;
        int b = -1;
        int result = 0;
        int err = 1;
        String error = "Вы ввели неверную операцию! Проверьте пробелы между числами.\nЧисла должны быть от 1 до 10.\nПример: 10 + 10";

        // Объявлем массив символов и вписываем туда строку "str", которую ввел ползователь в консоль
        char[] array = str.toCharArray();

        // Решение выражения с проверкой по длинне массива 5, 6 или 7, в случае меньшей длинны или большей,
        // вывод "error" в консоль и просьба ввести выражение верно!

        // Если длина массива 5
        if (array.length == 5) {
            if (array[1] == ' ' && array[3] == ' ') {
                if (array[0] == '1') {
                    a = 1;
                } else if (array[0] == '2') {
                    a = 2;
                } else if (array[0] == '3') {
                    a = 3;
                } else if (array[0] == '4') {
                    a = 4;
                } else if (array[0] == '5') {
                    a = 5;
                } else if (array[0] == '6') {
                    a = 6;
                } else if (array[0] == '7') {
                    a = 7;
                } else if (array[0] == '8') {
                    a = 8;
                } else if (array[0] == '9') {
                    a = 9;
                } else {
                    err = -1;
                }

                if (array[4] == '1') {
                    b = 1;
                } else if (array[4] == '2') {
                    b = 2;
                } else if (array[4] == '3') {
                    b = 3;
                } else if (array[4] == '4') {
                    b = 4;
                } else if (array[4] == '5') {
                    b = 5;
                } else if (array[4] == '6') {
                    b = 6;
                } else if (array[4] == '7') {
                    b = 7;
                } else if (array[4] == '8') {
                    b = 8;
                } else if (array[4] == '9') {
                    b = 9;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 5
                if (array[2] == '+') {
                    result = a + b;
                } else if (array[2] == '-') {
                    result = a - b;
                } else if (array[2] == '*') {
                    result = a * b;
                } else if (array[2] == '/') {
                    result = a / b;
                } else {
                    err = -1;
                }
            } else {
                err = -1;
            }
            // Если длина массива 6
        } else if (array.length == 6) {
            if (array[1] == ' ' && array[3] == ' ') {
                if (array[0] == '1') {
                    a = 1;
                } else if (array[0] == '2') {
                    a = 2;
                } else if (array[0] == '3') {
                    a = 3;
                } else if (array[0] == '4') {
                    a = 4;
                } else if (array[0] == '5') {
                    a = 5;
                } else if (array[0] == '6') {
                    a = 6;
                } else if (array[0] == '7') {
                    a = 7;
                } else if (array[0] == '8') {
                    a = 8;
                } else if (array[0] == '9') {
                    a = 9;
                } else {
                    err = -1;
                }

                if (array[4] == '1') {
                    b = 1;
                    if (array[5] == '0') {
                        b = 10;
                    } else {
                        err = -1;
                    }
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 6 и 1 вариант
                if (array[2] == '+') {
                    result = a + b;
                } else if (array[2] == '-') {
                    result = a - b;
                } else if (array[2] == '*') {
                    result = a * b;
                } else if (array[2] == '/') {
                    result = a / b;
                } else {
                    err = -1;
                }
            } else if (array[2] == ' ' && array[4] == ' ') {
                if (array[0] == '1') {
                    a = 1;
                    if (array[1] == '0') {
                        a = 10;
                    } else {
                        err = -1;
                    }
                } else {
                    err = -1;
                }
                if (array[5] == '1') {
                    b = 1;
                } else if (array[5] == '2') {
                    b = 2;
                } else if (array[5] == '3') {
                    b = 3;
                } else if (array[5] == '4') {
                    b = 4;
                } else if (array[5] == '5') {
                    b = 5;
                } else if (array[5] == '6') {
                    b = 6;
                } else if (array[5] == '7') {
                    b = 7;
                } else if (array[5] == '8') {
                    b = 8;
                } else if (array[5] == '9') {
                    b = 9;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 6 и 2 второй вариант
                if (array[3] == '+') {
                    result = a + b;
                } else if (array[3] == '-') {
                    result = a - b;
                } else if (array[3] == '*') {
                    result = a * b;
                } else if (array[3] == '/') {
                    result = a / b;
                } else {
                    err = -1;
                }
            } else {
                err = -1;
            }
            // Если длина массива 7
        } else if (array.length == 7) {
            if (array[2] == ' ' && array[4] == ' ') {
                if (array[0] == '1' && array[1] == '0') {
                    a = 10;
                } else {
                    err = -1;
                }

                if (array[5] == '1' && array[6] == '0') {
                    b = 10;
                } else {
                    err = -1;
                }
            }
            // Вычисление выражения
            if (array[3] == '+') {
                result = a + b;
            } else if (array[3] == '-') {
                result = a - b;
            } else if (array[3] == '*') {
                result = a * b;
            } else if (array[3] == '/') {
                result = a / b;
            } else {
                err = -1;
            }
        } else {
            err = -1;
        }
        // Вывод ответа в консоль. Ошибка или результат!
        if (err < 0) {
            System.out.println(error);
        } else {
            System.out.println(result);
        }
    }
}