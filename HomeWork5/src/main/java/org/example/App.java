package org.example;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.HW5.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Введите данные" );
      // printThreeWords();

       Scanner console = new Scanner(System.in);
       int a = console.nextInt();
       int b = console.nextInt();
      // checkSumSign(a,b);
      // printColor(a);
      // compareNumbers(a,b);
      //  trueFalse(a,b);
      // printplusMinus(a);
      //  System.out.println(numberMinus(a));
      /*    System.out.println( "Введите строку а потом число" );
        String b = console.nextLine();
        int a = console.nextInt();
        repeatLine(b,a);
        */
        //System.out.println(leapYear(a));

        // zero2one();

        // fromOne2hundred ();

        // numberLessSixMultilyTwo();

        // diagonal2one(a);

        System.out.println(Arrays.toString(arrayLeightLenWithInitialValue(a,b)));

    }



}
