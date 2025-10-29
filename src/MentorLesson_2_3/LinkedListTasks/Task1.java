package MentorLesson_2_3.LinkedListTasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {



    List<String> names = new LinkedList<>();
    names.add("Tofiq");
    names.add("Behrem");
    names.add("Faiq");
    names.add("Fuad");
    names.addFirst("VIP");
    names.removeLast();

    for (String a : names){
        System.out.println(a);
    }


} }
