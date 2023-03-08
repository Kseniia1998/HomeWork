package home_work3;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        int menuOptionNum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Select the language by entering the corresponding number:");
        System.out.println("1-Українська");
        System.out.println("2-English");
        System.out.println("3-Română");
        try {
            menuOptionNum = sc.nextInt();
        } catch (Exception exception) {
            System.out.println("You enter wrong input");
            return;
        }
        if (menuOptionNum == 1) {
            System.out.println("Привіт :з");
        }
        if (menuOptionNum == 2) {
            System.out.println("Hello ;)");
        }
        if (menuOptionNum == 3) {
            System.out.println("Buna ziua =р");
        }

    }
}
