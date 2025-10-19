package MentorLesson_2_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task1_FileCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yaradilacaq faylin adini daxil edin: ");
        String input = sc.nextLine();
        File file = new File(input);

        try {
            if(!file.exists()){
                if(file.createNewFile()) System.out.println(file.getName() + "-->adli file yaradildi -->" + file.getAbsolutePath());
            }else {
                System.out.println("File movcuddur.File uzunluqu--> " +file.length());
            }

        }catch (IOException e){
            System.out.println("Xeta --> " + e.getMessage());
        }

    }


}