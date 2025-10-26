package MentorLesson_2_2.Task3;

import java.util.List;

public class BonusCalculator {

    public  double calculateBonus(List<? extends Employee> employees) {
        double total = 0;
        for (Employee e : employees) {
            total += e.getSalary() * 0.1;
        }
        return total;
    }
}