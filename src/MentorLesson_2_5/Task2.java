package MentorLesson_2_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("hasan","1234");
        map.put("vali","9526");
        map.put("ehed","8521");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your password:");
        String pswrd = sc.nextLine();

        if (map.containsKey(name) && map.get(name).equals(pswrd)){
            System.out.println("✅ Giriş uğurludur! Xoş gəldiniz," + name + "!");

        }else {
            System.out.println("❌ Yanlış istifadəçi adı və ya parol!");
        }

       sc.close();

    }
}
