package MentorLesson_2_6;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<Integer> nums = List.of(
                2,4,5,6,7,8,9,10
        );

        List<Integer> kvadrat = nums.stream()
                .map(n->n*n)
                .toList();
        System.out.println(kvadrat);



    }
}
