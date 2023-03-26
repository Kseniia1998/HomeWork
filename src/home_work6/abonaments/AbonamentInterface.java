package home_work6.abonaments;

import home_work6.DateFormatInterface;

public interface AbonamentInterface extends DateFormatInterface {
    boolean isValid();

    int getVisitNumber();

    String getType();

    void setVisitNumber(int visitNumber);
}
