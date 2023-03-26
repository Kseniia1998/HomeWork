package home_work6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Schedule {

    private final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
    private String type;
    private Date workingTimeFrom;
    private Date workingTimeTo;
    private Date fitnessTimeFrom;
    private Date fitnessTimeTo;

    public Schedule(String type, String fitnessTimeFrom, String fitnessTimeTo) throws Exception {
        this.type = type;
        this.setWorkingTimeTo("22:00");
        this.setWorkingTimeFrom("08:00");
        this.setFitnessTimeFrom(fitnessTimeFrom);
        this.setFitnessTimeTo(fitnessTimeTo);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                ", type='" + type + '\'' +
                ", workingTimeFrom=" + getWorkingTimeFrom() +
                ", workingTimeTo=" + getWorkingTimeTo() +
                ", fitnessTimeFrom=" + getFitnessTimeFrom() +
                ", fitnessTimeTo=" + getFitnessTimeTo() +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWorkingTimeFrom() {
        return formatter.format(workingTimeFrom);
    }

    public void setWorkingTimeFrom(String workingTimeFrom) {
        try {
            this.workingTimeFrom = formatter.parse(workingTimeFrom);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    public String getWorkingTimeTo() {
        return formatter.format(workingTimeTo);
    }

    public void setWorkingTimeTo(String workingTimeTo) {
        try {
            this.workingTimeTo = formatter.parse(workingTimeTo);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public String getFitnessTimeFrom() {
        return formatter.format(fitnessTimeFrom);
    }

    public void setFitnessTimeFrom(String fitnessTimeFrom) throws Exception {
            Date time = formatter.parse(fitnessTimeFrom);
            if (time.compareTo(this.workingTimeFrom) < 0) {
                throw new Exception("Время начала тренеровки " + fitnessTimeFrom + " не может быть меньше, чем время открытия фитнес клуба " + this.getWorkingTimeFrom());
            }
            this.fitnessTimeFrom = time;
    }

    public String getFitnessTimeTo() {
        return formatter.format(fitnessTimeTo);
    }

    public void setFitnessTimeTo(String fitnessTimeTo) {
        try {
            Date time = formatter.parse(fitnessTimeTo);
            if (time.compareTo(this.workingTimeTo) > 0) {
                throw new Exception("Время конца тренеровки " + fitnessTimeTo + " не может быть больше, чем время закрытия фитнес клуба " + this.getWorkingTimeTo());
            }
            this.fitnessTimeTo = time;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
