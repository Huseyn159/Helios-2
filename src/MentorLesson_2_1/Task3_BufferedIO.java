package MentorLesson_2_1;


import java.io.*;

public class Task3_BufferedIO {
    public static void main(String[] args) {


        try(FileWriter fw = new FileWriter("file1.txt");
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("Birinci");
            bw.newLine();
            bw.write("Ikinci");
            bw.newLine();
            bw.write("Ucuncu");
            bw.newLine();
            bw.write("Dorduncu");
            bw.newLine();
            bw.write("Besinci");

        }catch (IOException e){
            System.out.println("XETA ---> " + e.getMessage());
        }

        try(FileReader fr = new FileReader("file1.txt");
            BufferedReader br = new BufferedReader(fr)){
            int setrSayi = 1;
            String setr;
            while ((setr = br.readLine())!=null){
                System.out.println(setrSayi + "-ci "+ setr);
                setrSayi++;
            }

        }catch (IOException e){
            System.out.println("XETA ---> " + e.getMessage());
        }

    }
}
