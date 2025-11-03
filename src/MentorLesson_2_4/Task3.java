package MentorLesson_2_4;

import java.util.Set;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();

        nums.add(15);
        nums.add(6);
        nums.add(4);
        nums.add(5);

       nums.forEach(System.out::println);

    }
}
