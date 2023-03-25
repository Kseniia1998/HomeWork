package home_work5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Abonement {
    private final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    private double price;
    private int totalCountOfVisits;
    private int visitNumber;
    private Date validTo;

    public Abonement(double price, int totalCountOfVisits, int visitNumber, String validToDate) throws ParseException {
        this.price = price;
        this.totalCountOfVisits = totalCountOfVisits;
        this.visitNumber = visitNumber;
        setValidTo(validToDate);
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

    public void setValidTo(String validTo) throws ParseException {
        this.validTo = formatter.parse(validTo);
    }

    public boolean isValid(){
        return (visitNumber <= totalCountOfVisits) && (new Date().compareTo(this.validTo) < 0);
    }

    @Override
    public String toString() {
        return "Abonement{" +
                ", price=" + price +
                ", totalCountOfVisits=" + totalCountOfVisits +
                ", visitNumber=" + visitNumber +
                ", validToDate=" + getValidTo() +
                ", isValid=" + isValid() +
                '}';
    }
}
