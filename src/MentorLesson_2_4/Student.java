package MentorLesson_2_4;

import java.util.Set;

public class Student implements Comparable<Student>{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age,o.age);
    }

    public String toString() {
        return name + " (" + age + ")";
    }

}


