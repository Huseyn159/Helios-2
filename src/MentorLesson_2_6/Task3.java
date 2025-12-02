package MentorLesson_2_6;

import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<String> words = List.of(
                "car","one","two","market",
                "hospital"
        );

        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }


}
