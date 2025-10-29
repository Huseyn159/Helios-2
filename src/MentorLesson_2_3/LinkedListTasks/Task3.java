package MentorLesson_2_3.LinkedListTasks;

import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<String> cities = new LinkedList<>();
        cities.add("Baku");
        cities.add("Istanbul");
        cities.add("Paris");
        cities.add("London");

        int middle = cities.size()/2;

        cities.add(middle,"Tokio");
        cities.remove("Baku");

        for (String l : cities){
            System.out.println(l);
        }



    }
}
