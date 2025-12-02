package MentorLesson_2_6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {


        List<String> words = List.of(
          "Alim","Azer","Ceyhun","Zaur",
          "Nurlan","Behruz","Todiq"
        );

        Map<Character,List<String>> sorted = words.stream()
                .sorted()
                .collect(Collectors.groupingBy(n->n.charAt(0)));

        System.out.println(sorted);


    }
}
