package MentorLesson_2_5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Ali",80);
        map1.put("Vali",95);
        map1.put("Hasan",45);

        map1.forEach((k,v) -> System.out.println("Name:  " + k +  "  Grade:  "+v));
    }
}
