package MentorLesson_2_1;

import java.io.*;

public class Task2_SimpleIO {
    public static void main(String[] args) {

      try(FileWriter fr = new FileWriter("hekaye.txt")){

          fr.write("ilk setr\n");
          fr.write("ikinci setr\n");
          fr.write("ucuncu setr \n");

          }catch (IOException e){
          System.out.println("Xeta ---> " +e.getMessage());
      }
        try(FileReader fileReader = new FileReader("hekaye.txt")) {
            int ch;
            System.out.println("Faylin mezmunu: ");
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Xeta ---> " + e.getMessage());
        }







    }
}
