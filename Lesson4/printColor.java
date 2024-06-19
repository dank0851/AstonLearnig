/*3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 
(0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”; */

public class printColor {
    public static void main(String[] args) {
       int value=101;
        if (value <=0) {
            System.out.println("Красный");
        }
         else if (value>100) {
            System.out.println("Зелёный");
            }
        else {
            System.out.println("Желтый");
        }
    }
}