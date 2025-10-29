package MentorLesson_2_3.ArraylistTasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {


        List<String> players = new ArrayList<>();

        players.add("Messi");
        players.add("Ronaldo");
        players.add("Salah");
        players.add("Haaland");
        players.add("Ribery");

        int c = 1;
        for (String e : players){
            System.out.println(c + ". " + e);c++;

        }




    }



}
