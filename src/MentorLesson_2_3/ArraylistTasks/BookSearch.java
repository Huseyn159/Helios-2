package MentorLesson_2_3.ArraylistTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookSearch {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();

        books.add("Math fundamentals");
        books.add("Secret");
        books.add("Book3");

        Scanner sc = new Scanner(System.in);
        System.out.println("Axtardiginiz kitabin adin daxil edin: ");
        String input =  sc.nextLine();

       if (books.contains(input)){
           System.out.println("Kitab tapıldı");
           System.out.println(input);
       }
       else {
           System.out.println("Kitab movcud deyil");
       }


    }
}
