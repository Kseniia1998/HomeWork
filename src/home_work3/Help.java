package home_work3;

import java.util.Arrays;
import java.util.Scanner;

public class Help {
    private void showMenu() {
        System.out.println("Help:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println("5. do-while");
        System.out.println("6. break");
        System.out.println("7. continue");
        System.out.println("Enter q for exit.");
    }

    public void helpOn() {
        String menuNumber = "";

        while(!menuNumber.equals("q")) {
            this.showMenu();

            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter menu number:");

            menuNumber = sc.next();

            if(this.isValid(menuNumber)) {
                if (menuNumber.equals("1")) {
                    System.out.println("Oпepaтop if:\n");
                    System.out.println("if(ycлoвиe) оператор;");
                    System.out.println("else оператор;\n");
                }

                if (menuNumber.equals("2")) {
                    System.out.println("Oпepaтop switch:\n");
                    System.out.println("switch(выpaжeниe) {");
                    System.out.println(" case константа:");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println("}\n");
                }

                if (menuNumber.equals("3")) {
                    System.out.println("Oпepaтop for:\n");
                    System.out.print("for(инициaлизaция; условие; итерация)");
                    System.out.println(" оператор;\n");
                }

                if (menuNumber.equals("4")) {
                    System.out.println("Oпepaтop while:\n");
                    System.out.println("while(ycлoвиe) оператор;\n");

                }

                if (menuNumber.equals("5")) {
                    System.out.println("Oпepaтop do-while:\n");
                    System.out.println("do {");
                    System.out.println(" оператор;");
                    System.out.println("} while (условие};\n");
                }

                if (menuNumber.equals("6")) {
                    System.out.println("Oпepaтop break:\n");
                    System.out.println("break; или break метка;\n");
                }

                if (menuNumber.equals("7")) {
                    System.out.println("Oпepaтop continue:\n");
                    System.out.println("continue; или continue метка;\n");
                }
            }else{
                System.out.println("Wrong menu option. Try again.\n");
            }
        }
    }

    private boolean isValid(String menuNumber) {
        return Arrays.asList("1","2","3","4","5","6","7","q").contains(menuNumber);
    }
}
