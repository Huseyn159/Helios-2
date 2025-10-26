package MentorLesson_2_2.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Engineer> engs = new ArrayList<>();
        engs.add(new Engineer(7500.0, "DevOps", 10));
        engs.add(new Engineer(6200.0, "Backend", 6));
        engs.add(new Engineer(5400.0, "Frontend", 4));

        List<Manager> managers = new ArrayList<>();
        managers.add(new Manager(8500.0, "IT", 6));
        managers.add(new Manager(9100.0, "Finance", 8));
        managers.add(new Manager(7800.0, "HR", 5));

        List<Intern> interns = new ArrayList<>();
        interns.add(new Intern(300.0, "BDU", "Vuqar", 2));
        interns.add(new Intern(250.0, "ADNSU", "Aysel", 3));
        interns.add(new Intern(280.0, "ADA", "Nicat", 1));


        BonusCalculator calculator = new BonusCalculator();
        System.out.println("Engineer total bonus: " + calculator.calculateBonus(engs));
        System.out.println("Manager total bonus: "  + calculator.calculateBonus(managers));
        System.out.println("Intern total bonus: " + calculator.calculateBonus(interns));






    }
}
