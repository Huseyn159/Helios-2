package MentorLesson_2_3.Examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Insertation {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
//        for (int i = 0; i < 1000; i++) {
//            arrayList.add(0 ,i);
//
//        }    ADDFIRST
        for (int i = 0; i < 1000; i++) {
            arrayList.addLast(i);
        }
        long end = System.nanoTime();
        System.out.println("Arraylist bashdan elave: " + (end - start));

        start = System.nanoTime();
//        for (int i = 0; i < 1000; i++) {
//            linkedList.add(0,i);
//
//        }ADDFIRST
        for (int i = 0; i < 1000; i++) {
            linkedList.addLast(i);

        }
        end = System.nanoTime();
        System.out.println("Linkedlist bashdan elave: " + (end - start));
    }

}
