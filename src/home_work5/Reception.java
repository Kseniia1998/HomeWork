package home_work5;

public class Reception {
    public static void main(String[] args) throws Exception {

        FitnessClub fitnessClub = new FitnessClub("Паляниця", "Київська 43", 100);

        Client client1 = new Client(
                "Luda",
                "Ivanova",
                30,
                "female",
                "weekend",
                "13:00",
                "15:00",
                new Instructor("Valera", "Petrov"),
                new Abonement(400.00,12,1, "25-04-2023"));

        fitnessClub.addNewClient(client1);

        Client client2 = new Client(
                "Luda2",
                "Ivanova",
                300,
                "female",
                "weekend",
                "13:00",
                "15:00",
                new Abonement(50,1,1, "25-03-2023")
        );

        fitnessClub.addNewClient(client2);

        fitnessClub.getClientByName("Luda").increaseVisitNumberByOne();
        fitnessClub.getClientByName("Luda").increaseVisitNumberByOne();
        fitnessClub.getClientByName("Luda").increaseVisitNumberByOne();

        fitnessClub.getClientByName("Luda2").increaseVisitNumberByOne();

        System.out.println(client1);
        System.out.println(client2);
    }
}
