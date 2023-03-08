package home_work3;

import java.util.Scanner;

public class Calculator {

    public static void compare(double num1, double num2) {
        if ( num1 == num2 ) {
            System.out.printf("%.2f == %.2f\n", num1, num2);
        }

        if ( num1 < num2 ) {
            System.out.printf("%.2f < %.2f\n", num1, num2);
        }
        if ( num1 > num2 ){
            System.out.printf( "%.2f > %.2f\n", num1, num2 );
        }

    }
    public static void main(String[] args) {

        double num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");


        num1 = sc.nextDouble();

        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+,avg,compare)");

        String op = sc.next();

        double res = 0;

        switch (op) {

            case "+":
                res = num1 + num2;
                System.out.println("The final result:");
                System.out.println();
                System.out.println(num1 + " " + op + " " + num2 + " = " + res);
                break;
            case "avg":
                res = (num1 + num2) / 2;
                System.out.println("The final result:");
                System.out.println();
                System.out.println( op + " = " + res);
                break;
            case "compare":
                Calculator.compare( num1, num2);
                break;

            default:
                System.out.println("You enter wrong input");
        }

    }
}
