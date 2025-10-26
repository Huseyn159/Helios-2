package MentorLesson_2_2.Task1;
import java.util.ArrayList;
import java.util.List;
public class Storage <T>{
    private List<T> items = new ArrayList<>();

    public  void store(T item){
        items.add(item);
    }

    public void retrieve() {
        for (T element : items) {
            System.out.println(element);
        }
    }
}
