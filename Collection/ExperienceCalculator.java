package Collection;

import java.time.LocalDate;
import java.time.Period;
public class ExperienceCalculator {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2020, 6, 15); // Example Wipro joining date
        LocalDate today = LocalDate.now();
        Period experience = Period.between(joiningDate, today);
        System.out.println("Experience: " + experience.getYears() + " years, "
                + experience.getMonths() + " months, "
                + experience.getDays() + " days.");
    }
}

