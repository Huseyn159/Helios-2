package MentorLesson_2_6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> nums = List.of(
                1,5,6,8,2,3,12,24,36,48,3,11

        );

        Map<String,List<Integer>> cutEded=nums.stream()
                .filter(n->(n%2) == 0)
                .collect(Collectors.groupingBy(n -> "Cut eded"));


        Map<String,List<Integer>> tekEded=nums.stream()
                .filter(n->(n%2) != 0)
                .collect(Collectors.groupingBy(n -> "Tek eded"));


        System.out.println(tekEded);
        System.out.println(cutEded);

    }


}
