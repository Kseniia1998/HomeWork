package home_work3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int num1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        try {
            num1 = sc.nextInt();
        } catch (Exception exception) {
            System.out.println("Wrong number type.");
        }

        boolean isPositive = num1 >= 0;
        num1 = isPositive ? num1 : num1 * -1;

        Map<Integer,Integer> uniquePairs = new HashMap<>();

        System.out.println("Все пары >> ");
        for (int i = num1 * -1; i <= num1; i++) {
            if (i != 0 && num1 % i == 0) {
                int secVal = num1 / (isPositive ? i : i * -1);
                System.out.println(i + " : " + secVal);
                if(i <= secVal){
                    uniquePairs.put(i,secVal);
                    continue;
                }
                uniquePairs.put(secVal,i);
            }
        }
        System.out.println("Только уникальные пары >> ");
        System.out.println(uniquePairs);
    }
}
