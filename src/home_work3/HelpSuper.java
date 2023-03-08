package home_work3;

import java.util.*;

public class HelpSuper {

    private final Map<String, Map<String, String>> menu = new HashMap<>();

    public HelpSuper(){
        this.setMenuOption("1","if1","Oпepaтop if1:\n\nif(ycлoвиe) оператор;\nelse оператор;\n\n");
        this.setMenuOption("2","if2","Oпepaтop if2:\n\nif(ycлoвиe) оператор;\nelse оператор;\n\n");
        this.setMenuOption("3","if3","Oпepaтop if3:\n\nif(ycлoвиe) оператор;\nelse оператор;\n\n");
        this.setMenuOption("4","if4","Oпepaтop if4:\n\nif(ycлoвиe) оператор;\nelse оператор;\n\n");
        this.setMenuOption("5","if5","Oпepaтop if5:\n\nif(ycлoвиe) оператор;\nelse оператор;\n\n");
        this.setMenuOption("6","if6","Oпepaтop if6:\n\nif(ycлoвиe) оператор;\nelse оператор;\n\n");
    }

    private void showMenu() {
        System.out.println("Help:");
        menu.forEach((menuNumber, menuData) -> System.out.println(menuNumber+"."+menuData.get("menu_description")));
    }

    public void helpOn() {
        String menuNumber = "";
        String exitChar = "q";

        while(!menuNumber.equals(exitChar)) {
            this.showMenu();
            System.out.println("Enter "+exitChar+" for exit.");

            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter menu number:");

            menuNumber = sc.next();

            if(!this.isValid(menuNumber)) {
                System.out.println("Wrong menu option. Try again.\n");
                continue;
            }

            System.out.println(menu.get(menuNumber).get("content"));
        }
    }

    private boolean isValid(String menuNumber) {
        return this.menu.containsKey(menuNumber);
    }

    public void setMenuOption(String menuNumber, String menuDescription, String content){
        Map<String,String> data = new HashMap<>();
        data.put("menu_description", menuDescription);
        data.put("content", content);
        this.menu.put(menuNumber, data);
    }
}
