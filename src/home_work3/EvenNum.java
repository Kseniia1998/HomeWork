package home_work3;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {

        double num1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        num1 = sc.nextDouble();

        if (num1 % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
