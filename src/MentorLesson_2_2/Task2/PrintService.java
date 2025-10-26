package MentorLesson_2_2.Task2;

import java.util.List;

public class PrintService {

    public void printAll(List<?> list){
        for (Object item : list){
            System.out.println(item);
        }
    }
}
