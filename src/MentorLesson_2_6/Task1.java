package MentorLesson_2_6;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<String> words = List.of(
                "Baku","Berlin","Paris","Copenhagen","Stockholm",
                "Palermo","Toledo","Moscow"
        );

        List<String> filtered = words.stream()
                .filter(w -> w.length() > 5)
                .toList();

        int count = filtered.size();
        double avg = filtered.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);

        System.out.println("Count = " + count);
        System.out.println("Average length = " + avg);



    }
}
