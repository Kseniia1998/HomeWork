package home_work6;

import home_work6.abonaments.Business;
import home_work6.abonaments.Economy;
import home_work6.abonaments.Premium;
import home_work6.instructors.InstructorDancer;
import home_work6.instructors.InstructorGymnast;

public class Reception {
    public static void main(String[] args) throws Exception {

        FitnessClub fitnessClub = new FitnessClub("Паляниця", "Київська 43", 100);

        Client luda = fitnessClub.createClient(
                "Luda",
                "Ivanova",
                30,
                "female",
                "weekend",
                "13:00",
                "15:00",
                new InstructorGymnast(),
                new Business());

        Client luda2 = fitnessClub.createClient(
                "Luda2",
                "Ivanova",
                300,
                "female",
                "weekend",
                "13:00",
                "15:00",
                new Economy()
        );

        Client luda3 = fitnessClub.createClient(
                "Luda3",
                "Ivanova",
                10,
                "female",
                "weekend",
                "13:00",
                "15:00",
                new InstructorDancer(),
                new Premium());

        luda.increaseVisitNumberByOne();
        luda.increaseVisitNumberByOne();
        luda.increaseVisitNumberByOne();

        luda2.increaseVisitNumberByOne();

        System.out.println(luda);
        System.out.println(luda2);
        System.out.println(luda3);
    }
}
