package MentorLesson_2_4;

import java.util.Set;
import java.util.TreeSet;

public class Task4 {

        public static void main(String[] args) {
            Set<Student> students = new TreeSet<>();
            students.add(new Student("Elvin", 22));
            students.add(new Student("Aysel", 19));
            students.add(new Student("Murad", 25));

            System.out.println(students);
        }
}
