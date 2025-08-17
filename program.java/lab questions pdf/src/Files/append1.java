package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.Exception;

public class append1 {
    public static void main(String args[]) throws Exception{
        File f=new File("C:\\Users\\patet\\OneDrive\\Desktop\\lab pdf  questions\\abc.txt");
        File f1=new File("C:\\Users\\patet\\OneDrive\\Desktop\\lab pdf  questions\\xyz.txt");
        File f2=new File("C:\\Users\\patet\\OneDrive\\Desktop\\lab pdf  questions\\def.txt");
        f.createNewFile();
        f1.createNewFile();
        f2.createNewFile();
        FileReader fr=new FileReader(f);
        FileReader fr1=new FileReader(f1);
        FileWriter fw=new FileWriter(f2);
        FileReader fr2=new FileReader(f2);
        int i=0;
        int j=0;
        while((i=fr.read())!=-1) {
            fw.write((char) i);
        }
        while((j=fr1.read())!=-1){
                fw.append((char)j);
            }
        System.out.println("printing the data in file:");
        while((i=fr2.read())!=-1){
            System.out.println((char)i);
        }
        fw.flush();
        fw.close();


    }
}
