package home_work6.abonaments;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Business extends Abonement{
    public Business() throws ParseException {
        super("Business",400.00, 36, 0, 3);
    }
}
