package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class program5 {
    //FileInputStream
    //FileWriter
    //bufferedWriter
    public static void main(String args[]) throws IOException {
        File file = new File("C:\\Users\\patet\\OneDrive\\Desktop\\practice.java\\samples.txt");
        if (file.exists()) {
           file.delete();
        }
        file.createNewFile();
        // Writing methods in files
        FileOutputStream fr=new FileOutputStream(file);
       String s="hello";
       char y[]=s.toCharArray();
       for(int i=0;i<y.length;i++){
           fr.write((int)y[i]);
       }
       fr.flush();
       fr.close();
    }
}
