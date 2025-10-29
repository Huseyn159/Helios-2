package MentorLesson_2_3.ArraylistTasks;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<Integer> weights = new ArrayList<>();
        weights.add(7);
        weights.add(9);
        weights.add(4);
        weights.add(2);
        weights.add(6);

        List<Integer> heavyWeights = new ArrayList<>();
        for (Integer a : weights){
            if (a>5){
                heavyWeights.add(a);
                System.out.println(a);
            }

        }


    }
}
