package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class HW5 {

    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        Scanner console = new Scanner(System.in);
        a = console.nextInt();
        b = console.nextInt();

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицатльная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зелёный");
        } else {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers(int acompareNumbers, int bcompareNumbers) {
        if (acompareNumbers >= bcompareNumbers) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void trueFalse(int atrueFalse, int btrueFalse) {


        if (((atrueFalse + btrueFalse) >= 10) && ((atrueFalse + btrueFalse) <= 20)) {

            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }






        /*
            6. Напишите метод, которому в качестве параметра передается целое число,
             метод должен напечатать в консоль, положительное ли число передали или
             отрицательное. Замечание: ноль считаем положительным числом.
             */

    public static void printplusMinus(int aprintplusMinus) {
        String result;
        if (aprintplusMinus >= 0) {
            result = "положительное";
        } else {
            result = "отрицательное";
        }
        System.out.println("Число " + result);
    }

    /*7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     *    если число отрицательное, и вернуть false если положительное.
     *     Замечание: ноль считаем положительным числом.
     * 8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
     *в консоль указанную строку, указанное количество раз;
     *9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
     *не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый
     *  400-й – високосный.
     */
    public static boolean numberMinus(int anumberMinus) {
        boolean result = (anumberMinus < 0);
        return result;
    }

    public static void repeatLine(String line, int arepeatLine) {
        for (int i = 0; i < arepeatLine; i++) {
            System.out.println(line);
        }
    }

    public static boolean leapYear(int aleapYear) {
        boolean resultLeapYear = false;
        if (aleapYear % 4 == 0) {
            if (aleapYear % 400 == 0) {
                return resultLeapYear = true;
            } else {
                if (0 == aleapYear % 100) {
                    return resultLeapYear = false;
                } else {
                    return resultLeapYear = true;
                }
            }
        }
        return resultLeapYear;
    }

    /*
    10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    * С помощью цикла и условия заменить 0 на 1, 1 на 0;
    11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
    12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
    14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
     int длиной len, каждая ячейка которого равна initialValue.
     */
    public static void zero2one(){
        int[] arrZero2one= {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for(int i = 0; i<10; i++)
             {
                if (arrZero2one[i] == 0) {
                    arrZero2one[i] = 1;

                } else {
                    arrZero2one[i] = 0;
                }

            }

        System.out.println(Arrays.toString(arrZero2one));
    }
    public static void fromOne2hundred () {
       int[] arrfromOne2hundred = new int[100];
       for (int i = 0; i<100; i++) {
           arrfromOne2hundred[i] =(i+1);
       }
        System.out.println(Arrays.toString(arrfromOne2hundred));
    }
    public static void numberLessSixMultiplyTwo() {
        int[] arrNumberLessSixMultiplyTwo = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0; i<(arrNumberLessSixMultiplyTwo.length);i++) {
            if (arrNumberLessSixMultiplyTwo[i] <6) {arrNumberLessSixMultiplyTwo[i]=arrNumberLessSixMultiplyTwo[i]*2;}
        }
        System.out.println(Arrays.toString(arrNumberLessSixMultiplyTwo));
    }
    public static void diagonal2one(int adiagonal2one) {
        int[][] arrdiagonal2one = new int[adiagonal2one][adiagonal2one];
        for (int i=0;i<adiagonal2one;i++){
            for (int j=0;j<adiagonal2one;j++) {
                if (i==j || i==((adiagonal2one-j-1))) {
                    arrdiagonal2one[i][j]=1;
                } else {arrdiagonal2one[i][j]=0;}
            }
        }
        for (int[] ints : arrdiagonal2one) {                    //вывод двумерного массива
            String string = Arrays.toString(ints);
            System.out.println(string);
        }
    }
    public static int[] arrayLeightLenWithInitialValue(int len, int initialValue) {
        int[] arrArrayLeightLenWithInitialValue = new int[len];
        for (int i= 0; i<len;i++) {
            arrArrayLeightLenWithInitialValue[i] = initialValue;
        }
        return arrArrayLeightLenWithInitialValue;
    }
}




