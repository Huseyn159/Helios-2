package MentorLesson_2_3.Examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Searching {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        for (int i = 0; i < 1000; i++) {
            arrayList.add(0 ,i);

        }




        for (int i = 0; i < 1000; i++) {
            linkedList.add(0,i);

        }


        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.get(i);

        }
        long end = System.nanoTime();
        System.out.println("Arraylist bashdan elave: " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.get(i);

        }
         end = System.nanoTime();
        System.out.println("Linkedlist bashdan elave: " + (end - start));






    }
}
