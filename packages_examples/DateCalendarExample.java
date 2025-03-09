package packages_examples;

import java.util.Date;
import java.util.Calendar;

public class DateCalendarExample {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar Date and Time: " + calendar.getTime());
    }
}
