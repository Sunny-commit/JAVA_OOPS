package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program1 {
    public static void main(String args[]) throws IOException {
        File f=new File("C:\\Users\\patet\\OneDrive\\Desktop\\practice.java\\sample.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        //there are 6 different ways of reading the data from text file
       // 1.FileInputStream,
       // 2.Scanner
                //3.FileReader
        //4.BufferedReader
        //--------------------------------FileInputStream-----------------------------------------
        FileInputStream fis=new FileInputStream(f);
        int as;
        while((as=fis.read())!=-1) {
            System.out.print((char)as);
        }
        fis.close();
    }

}
