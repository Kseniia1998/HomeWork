package home_work5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Schedule {

    private final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
    private String type;
    private Date workingTimeFrom;
    private Date workingTimeTo;
    private Date fitnessTimeFrom;
    private Date fitnessTimeTo;

    public Schedule(String type, String fitnessTimeFrom, String fitnessTimeTo) {
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
                ", workingTimeFrom=" + workingTimeFrom +
                ", workingTimeTo=" + workingTimeTo +
                ", fitnessTimeFrom=" + fitnessTimeFrom +
                ", fitnessTimeTo=" + fitnessTimeTo +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getWorkingTimeFrom() {
        return workingTimeFrom;
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

    public Date getFitnessTimeFrom() {
        return fitnessTimeFrom;
    }

    public void setFitnessTimeFrom(String fitnessTimeFrom) {
        try {
            this.fitnessTimeFrom = formatter.parse(fitnessTimeFrom);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public Date getFitnessTimeTo() {
        return fitnessTimeTo;
    }

    public void setFitnessTimeTo(String fitnessTimeTo) {
        try {
            Date time = formatter.parse(fitnessTimeTo);
            if (time.compareTo(this.workingTimeTo) > 0) {
                throw new Exception("Время тренеровки " + fitnessTimeTo + " не может быть больше, чем время закрытия фитнес клуба " + this.getWorkingTimeTo());
            }
            this.fitnessTimeTo = time;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
