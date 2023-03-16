package home_work4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Rewrite {
    public static void main(String[] args) {

        String word;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово:");

        word = sc.next();

        char[] wordChar = word.toCharArray();

        for(int i=wordChar.length-1;i>=0;i--) {
            System.out.print(wordChar[i]);
        }
    }
}
