package Collection;

import java.time.LocalDate;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = LocalDate.now().getYear();
        if (java.time.Year.isLeap(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

