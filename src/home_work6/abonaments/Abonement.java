package home_work6.abonaments;

import home_work6.DateFormatInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Abonement implements AbonamentInterface{

    private final String type;
    private double price;
    private int totalCountOfVisits;
    private int visitNumber;
    private Date validTo;

    public Abonement(String type, double price, int totalCountOfVisits, int visitNumber, int validMonths) throws ParseException {
        this.type = type;
        this.price = price;
        this.totalCountOfVisits = totalCountOfVisits;
        this.visitNumber = visitNumber;
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, validMonths);
        this.validTo = cal.getTime();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalCountOfVisits() {
        return totalCountOfVisits;
    }

    public void setTotalCountOfVisits(int totalCountOfVisits) {
        this.totalCountOfVisits = totalCountOfVisits;
    }

    public int getVisitNumber() {
        return visitNumber;
    }

    public void setVisitNumber(int visitNumber) {
        this.visitNumber = visitNumber;
    }

    public String getValidTo() {
        return formatter.format(validTo);
    }

    public String getType() {
        return type;
    }

    public void setValidTo(String validTo) throws ParseException {
        this.validTo = formatter.parse(validTo);
    }

    public boolean isValid(){
        return (visitNumber <= totalCountOfVisits) && (new Date().compareTo(this.validTo) < 0);
    }

    @Override
    public String toString() {
        return "{" +
                ", Abonament type=" + type +
                ", price=" + getPrice() +
                ", totalCountOfVisits=" + getTotalCountOfVisits() +
                ", visitNumber=" + getVisitNumber() +
                ", validToDate=" + getValidTo() +
                ", isValid=" + isValid() +
                '}';
    }

}
