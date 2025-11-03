package MentorLesson_2_4;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        Set<String> cities = new HashSet<>();
        cities.add("Baku");
        cities.add("Tokyo");
        cities.add("Berlin");
        cities.add("Berlin");

        System.out.println("Unique cities ");
        for (String a : cities){
            System.out.println("- " + a);
        }
    }
}
