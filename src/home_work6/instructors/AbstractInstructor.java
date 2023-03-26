package home_work6.instructors;

import home_work5.Instructor;
import home_work6.Client;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractInstructor implements InstructorInterface {
    private final String type;
    private String firstName;
    private String lastName;
    private final int totalSlots;
    private final List<Client> clientList;

    public AbstractInstructor(String type, String firstName, String lastName) {
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientList = new ArrayList<>();
        this.totalSlots = 5;
    }

    public void addClient(Client client){
        if(!haveFreeSlots()){
            System.out.println("У инструктора "+firstName+" нет свободных мест. Занят он");
            return;
        }
        clientList.add(client);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean haveFreeSlots(){
        return clientList.size() < totalSlots;
    }

    @Override
    public String toString() {
        return "AbstractInstructor{" +
                "type='" + type + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void printClientList(){
        System.out.println(clientList);
    }
}
