package MentorLesson_2_4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();

        names.add("Cabir");
        names.add("Aqil");
        names.add("Sabir");
        names.add("Famil");

        int count = 1;
        for (String a : names){
            System.out.println(count + ". " + a);
            count++;
        }


    }
}
