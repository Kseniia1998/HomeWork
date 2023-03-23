package home_work5;

public class Client {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private Abonement abonement;
    private Schedule schedule;



   public Client(String firstName, String lastName, int age, String gender, String scheduleType, String fitnessTimeFrom, String fitnessTimeTo){
       this.setFirstName(firstName);
       this.setLastName(lastName);
       this.setAge(age);
       this.setGender(gender);
       this.setSchedule(new Schedule(scheduleType, fitnessTimeFrom, fitnessTimeTo));


    }

    @Override
    public String toString() {
        return "Client: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", abonement=" + abonement +
                ", schedule=" + schedule;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public Abonement getAbonement () {
        return this.abonement;
    }

    public void setAbonement(Abonement abonement) {
        this.abonement = abonement;
    }
    public Schedule getSchedule () {
        return this.schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

}
