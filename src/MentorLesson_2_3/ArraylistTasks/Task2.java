package MentorLesson_2_3.ArraylistTasks;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> foods = new ArrayList<>();
        foods.add("Burger");
        foods.add("Pizza");
        foods.add("Salad");

        System.out.println(foods.size());

        foods.add("Doner");

        for (String a : foods){
            System.out.println(a);
        }


    }
}
