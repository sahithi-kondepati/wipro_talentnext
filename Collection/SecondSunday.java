package Collection;

import java.time.DayOfWeek;
import java.time.LocalDate;
public class SecondSunday {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextMonth = today.plusMonths(1).withDayOfMonth(1);
        int sundayCount = 0;
        LocalDate secondSunday = null;
        for (int i = 0; i < nextMonth.lengthOfMonth(); i++) {
            LocalDate date = nextMonth.plusDays(i);
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;
                if (sundayCount == 2) {
                    secondSunday = date;
                    break;
                }
            }
        }
        System.out.println("Second Sunday of next month: " + secondSunday);
    }
}

