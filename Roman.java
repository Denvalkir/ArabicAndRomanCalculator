package ArabicAndRomanCalculator;

public class Roman {
    public static void RomanString(String str) {

        // Объявлем переменные
        int a = -1;
        int b = -1;
        int result = 0;
        int err = 1;
        String error = "Вы ввели неверную операцию! Проверьте пробелы между числами.\nЧисла должны быть от I до X.\nВ римских нету отрицательных чисел, а значит и ответ не может быть отрицательным\nПример: VIII + X";

        char[] array = str.toCharArray();

        // Решение выражения
        // Если длина массива 5
        if (array.length == 5) {
            if (array[1] == ' ' && array[3] == ' ') {
                if (array[0] == 'I') {
                    a = 1;
                } else if (array[0] == 'V') {
                    a = 5;
                } else if (array[0] == 'X') {
                    a = 10;
                } else {
                    err = -1;
                }

                if (array[4] == 'I') {
                    b = 1;
                } else if (array[4] == 'V') {
                    b = 5;
                } else if (array[4] == 'X') {
                    b = 10;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 5 и 1 вариант
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
                if (array[0] == 'I') {
                    a = 1;
                } else if (array[0] == 'V') {
                    a = 5;
                } else if (array[0] == 'X') {
                    a = 10;
                } else {
                    err = -1;
                }

                if (array[4] == 'I') {
                    if (array[5] == 'I') {
                        b = 2;
                    } else if (array[5] == 'V') {
                        b = 4;
                    } else if (array[5] == 'X') {
                        b = 9;
                    } else {
                        err = -1;
                    }
                } else if (array[4] == 'V'){
                    if (array[5] == 'I') {
                        b = 6;
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
                if (array[0] == 'I') {
                    if (array[1] == 'I') {
                        a = 2;
                    } else if (array[1] == 'V') {
                        a = 4;
                    } else if (array[1] == 'X') {
                        a = 9;
                    } else {
                        err = -1;
                    }
                } else if (array[0] == 'V') {
                    if (array[1] == 'I') {
                        a = 6;
                    } else {
                        err = -1;
                    }
                } else {
                    err = -1;
                }

                if (array[5] == 'I') {
                    b = 1;
                } else if (array[5] == 'V'){
                    b = 5;
                } else if (array[5] == 'X') {
                    b = 10;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 6 и 2 вариант
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
            if (array[1] == ' ' && array[3] == ' ') {
                if (array[0] == 'I') {
                    a = 1;
                } else if (array[0] == 'V') {
                    a = 5;
                } else if (array[0] == 'X') {
                    a = 10;
                } else {
                    err = -1;
                }

                if (array[4] == 'I' && array[5] == 'I' && array[6] == 'I') {
                    b = 3;
                } else if (array[4] == 'V' && array[5] == 'I' && array[6] == 'I') {
                    b = 7;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 7 и 1 вариант
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
                if (array[0] == 'I') {
                    if (array[1] == 'I') {
                        a = 2;
                    } else if (array[1] == 'V') {
                        a = 4;
                    } else if (array[1] == 'X') {
                        a = 9;
                    } else {
                        err = -1;
                    }
                } else if (array[0] == 'V') {
                    if (array[1] == 'I') {
                        a = 6;
                    } else {
                        err = -1;
                    }
                }

                if (array[5] == 'I') {
                    if (array[6] == 'I') {
                        b = 2;
                    } else if (array[6] == 'V') {
                        b = 4;
                    } else if (array[6] == 'X') {
                        b = 9;
                    } else {
                        err = -1;
                    }
                } else if (array[5] == 'V') {
                    if (array[6] == 'I') {
                        b = 6;
                    } else {
                        err = -1;
                    }
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 7 и 2 вариант
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
            } else if (array[3] == ' ' && array[5] == ' ') {
                if (array[0] == 'I' && array[1] == 'I' && array[2] == 'I') {
                    a = 3;
                } else if (array[0] == 'V' && array[1] == 'I' && array[2] == 'I') {
                    a = 7;
                } else {
                    err = -1;
                }
                if (array[6] == 'I') {
                    b = 1;
                } else if (array[6] == 'V') {
                    b = 5;
                } else if (array[6] == 'X') {
                    b = 10;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 7 и 3 вариант
                if (array[4] == '+') {
                    result = a + b;
                } else if (array[4] == '-') {
                    result = a - b;
                } else if (array[4] == '*') {
                    result = a * b;
                } else if (array[4] == '/') {
                    result = a / b;
                } else {
                    err = -1;
                }
            }
            // Если длина массива 8
        } else if (array.length == 8) {
            if (array[1] == ' ' && array[3] == ' ') {
                if (array[0] == 'I') {
                    a = 1;
                } else if (array[0] == 'V') {
                    a = 5;
                } else if (array[0] == 'X') {
                    a = 10;
                } else {
                    err = -1;
                }

                if (array[4] == 'V' && array[5] == 'I' && array[6] == 'I' && array[7] == 'I') {
                    b = 8;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 8 и 1 вариант
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
                if (array[0] == 'I') {
                    if (array[1] == 'I') {
                        a = 2;
                    } else if (array[1] == 'V') {
                        a = 4;
                    } else if (array[1] == 'X') {
                        a = 9;
                    } else {
                        err = -1;
                    }
                } else if (array[0] == 'V') {
                    if (array[1] == 'I') {
                        a = 6;
                    } else {
                        err = -1;
                    }
                } else {
                    err = -1;
                }

                if (array[5] == 'I' && array[6] == 'I' && array[7] == 'I') {
                    b = 3;
                } else if (array[5] == 'V' && array[6] == 'I' && array[7] == 'I') {
                    b = 7;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 8 и 2 вариант
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
            } else if (array[3] == ' ' && array[5] == ' ') {
                if (array[0] == 'I' && array[1] == 'I' && array[2] == 'I') {
                    a = 3;
                } else if (array[0] == 'V' && array[1] == 'I' && array[2] == 'I') {
                    a = 7;
                } else {
                    err = -1;
                }

                if (array[6] == 'I') {
                    if (array[7] == 'I')
                        b = 2;
                    else if (array[7] == 'V') {
                        b = 4;
                    } else if (array[7] == 'X') {
                        b = 9;
                    }
                } else if (array[6] == 'V') {
                    if (array[7] == 'I') {
                        b = 6;
                    }
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 8 и 3 вариант
                if (array[4] == '+') {
                    result = a + b;
                } else if (array[4] == '-') {
                    result = a - b;
                } else if (array[4] == '*') {
                    result = a * b;
                } else if (array[4] == '/') {
                    result = a / b;
                } else {
                    err = -1;
                }
            } else if (array[4] == ' ' && array[6] == ' ') {
                if (array[0] == 'V' && array[1] == 'I' && array[2] == 'I' && array[3] == 'I') {
                    a = 8;
                } else {
                    err = -1;
                }

                if (array[7] == 'I') {
                    b = 1;
                } else if (array[7] == 'V'){
                    b = 5;
                } else if (array[7] == 'X') {
                    b = 10;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 8 и 4 вариант
                if (array[5] == '+') {
                    result = a + b;
                } else if (array[5] == '-') {
                    result = a - b;
                } else if (array[5] == '*') {
                    result = a * b;
                } else if (array[5] == '/') {
                    result = a / b;
                } else {
                    err = -1;
                }
            } else {
                err = -1;
            }
            // Если длина массива 9
        } else if (array.length == 9) {
            if (array[2] == ' ' && array[4] == ' ') {
                if (array[0] == 'I') {
                    if (array[1] == 'I') {
                        a = 2;
                    } else if (array[1] == 'V') {
                        a = 4;
                    } else if (array[1] == 'X') {
                        a = 9;
                    } else {
                        err = -1;
                    }
                } else if (array[0] == 'V') {
                    if (array[1] == 'I') {
                        a = 6;
                    } else {
                        err = -1;
                    }
                } else {
                    err = -1;
                }

                if (array[5] == 'V' && array[6] == 'I' && array[7] == 'I' && array[8] == 'I') {
                    b = 8;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 9 и 1 вариант
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
            } else if (array[3] == ' ' && array[5] == ' ') {
                if (array[0] == 'I' && array[1] == 'I' && array[2] == 'I') {
                    a = 3;
                } else if (array[0] == 'V' && array[1] == 'I' && array[2] == 'I') {
                    a = 7;
                } else {
                    err = -1;
                }

                if (array[6] == 'I' && array[7] == 'I' && array[8] == 'I') {
                    b = 3;
                } else if (array[6] == 'V' && array[7] == 'I' && array[8] == 'I') {
                    b = 7;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 9 и 2 вариант
                if (array[4] == '+') {
                    result = a + b;
                } else if (array[4] == '-') {
                    result = a - b;
                } else if (array[4] == '*') {
                    result = a * b;
                } else if (array[4] == '/') {
                    result = a / b;
                } else {
                    err = -1;
                }
            } else if (array[4] == ' ' && array[6] == ' ') {
                if (array[0] == 'V' && array[1] == 'I' && array[2] == 'I' && array[3] == 'I') {
                    a = 8;
                } else {
                    err = -1;
                }

                if (array[7] == 'I') {
                    if (array[8] == 'I') {
                        b = 2;
                    } else if (array[8] == 'V') {
                        b = 4;
                    } else if (array[8] == 'X') {
                        b = 9;
                    } else {
                        err = - 1;
                    }
                } else if (array[7] == 'V') {
                    if (array[8] == 'I') {
                        b = 6;
                    }
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 9 и 3 вариант
                if (array[5] == '+') {
                    result = a + b;
                } else if (array[5] == '-') {
                    result = a - b;
                } else if (array[5] == '*') {
                    result = a * b;
                } else if (array[5] == '/') {
                    result = a / b;
                } else {
                    err = -1;
                }
            } else {
                err = -1;
            }
            // Если длина массива 10
        } else if (array.length == 10) {
            if (array[3] == ' ' && array[5] == ' ') {
                if (array[0] == 'I' && array[1] == 'I' && array[2] == 'I') {
                    a = 3;
                } else if (array[0] == 'V' && array[1] == 'I' && array[2] == 'I') {
                    a = 7;
                } else {
                    err = -1;
                }

                if (array[6] == 'V' && array[7] == 'I' && array[8] == 'I' && array[9] == 'I') {
                    b = 8;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 10 и 1 вариант
                if (array[4] == '+') {
                    result = a + b;
                } else if (array[4] == '-') {
                    result = a - b;
                } else if (array[4] == '*') {
                    result = a * b;
                } else if (array[4] == '/') {
                    result = a / b;
                } else {
                    err = -1;
                }
            } else if (array[4] == ' ' && array[6] == ' ') {
                if (array[0] == 'V' && array[1] == 'I' && array[2] == 'I' && array[3] == 'I') {
                    b = 8;
                } else {
                    err = -1;
                }

                if (array[7] == 'I' && array[8] == 'I' && array[9] == 'I') {
                    a = 3;
                } else if (array[7] == 'V' && array[8] == 'I' && array[9] == 'I') {
                    a = 7;
                } else {
                    err = -1;
                }
                // Вычисление выражения длинна 10 и 2 вариант
                if (array[5] == '+') {
                    result = a + b;
                } else if (array[5] == '-') {
                    result = a - b;
                } else if (array[5] == '*') {
                    result = a * b;
                } else if (array[5] == '/') {
                    result = a / b;
                } else {
                    err = -1;
                }
            }
            // Если длина массива 11
        } else if (array.length == 11) {
            if (array[4] == ' ' && array[6] == ' ') {
                if (array[0] == 'V' && array[1] == 'I' && array[2] == 'I' && array[3] == 'I') {
                    a = 8;
                } else {
                    err = -1;
                }

                if (array[7] == 'V' && array[8] == 'I' && array[9] == 'I' && array[10] == 'I') {
                    b = 8;
                } else {
                    err = -1;
                }
            } else {
                err = -1;

            }
            // Вычисление выражения
            if (array[5] == '+') {
                result = a + b;
            } else if (array[5] == '-') {
                result = a - b;
            } else if (array[5] == '*') {
                result = a * b;
            } else if (array[5] == '/') {
                result = a / b;
            } else {
                err = -1;
            }
        }
        // Вывод ответа в консоль. Ошибка или результат!
        // Если вывод результата, то он конвертируется в римские цифры
        if (err < 0) {
            System.out.println(error);
        } else {
            System.out.println(ArabicAndRomanCalculator.ConverterArabianToRoman.ConverterArabicToRoman(result));
        }
    }
}