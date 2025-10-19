import java.io.File;
import java.io.IOException;

public class Dir_creator {
    public static void main(String[] args) {
        File dir = new File("src/MentorLesson_2_1");
        File file1 = new File(dir,"Task1_FileCreator.java");
        try{
        if(!dir.exists()){
            if(dir.mkdir()) System.out.println("Qovluq yaradildi");
        }
        if(!file1.exists()){

                if(file1.createNewFile()) System.out.println("Fayl yaradildi");

            }
        }catch (IOException e){
                System.out.println("Xeta bas verdi --> " + e.getMessage());
            }

    }
}
