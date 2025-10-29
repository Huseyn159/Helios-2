package MentorLesson_2_3.LinkedListTasks;

import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {



    List<String> messages = new LinkedList<>();
    messages.add("Salam");
    messages.add("Sagol");
    messages.add("Getdim");
    messages.add("Geldim");
    messages.removeLast();
    for (String a : messages){
        System.out.println(a);
    }


    }
}
