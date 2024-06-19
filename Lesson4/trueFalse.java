import java.util.Scanner;

public class trueFalse {
    public void main(String[] args){
        /*
        5. Напишите метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно),
         если да – вернуть true, в противном случае – false.
         */

        boolean rez;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int b = in.nextInt();

        if ((a+b)>=10) {
            if ((a+b)<=20) {
                System.out.println ( "True" );;
            }
            else {System.out.println ( "false" );;
            }
        }
        else {System.out.println ( "false" );;



        }

        /*
            6. Напишите метод, которому в качестве параметра передается целое число,
             метод должен напечатать в консоль, положительное ли число передали или
             отрицательное. Замечание: ноль считаем положительным числом.
             */
    public static void printplusMinus (int a, String rez) {
            a=5;
            if a>=0 {
                rez:="Положительное";
            }
            else{
                rez= "Отрицательное";
            }
        System.out.println("Число" + rez);
        }
    }

}
