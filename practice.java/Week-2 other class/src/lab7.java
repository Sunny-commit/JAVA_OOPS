import javax.annotation.processing.Filer;
import java.io.*;
import java.io.FileInputStream;

public class lab7 {
    // coping the words present in abc.txt to xyz.txt
    public static void main(String args[])throws Exception {
        try{
        File fr=new File("C:\\Users\\patet\\OneDrive\\Desktop","abc.txt");
        System.out.println(fr.exists());
        File f=new File("C:\\Users\\patet\\OneDrive\\Desktop","xyz.txt");
        System.out.println(f.exists());
        FileReader g=new FileReader(fr);
        char[] b=new char[(int)fr.length()];
        int l=(int)fr.length();
        g.read(b);
        System.out.println(b);
        //apppending
        FileWriter fw=new FileWriter(f,true);
        fw.write(b,0,l);
        fw.flush();
        fw.close();
        //overriding
        FileWriter fw1=new FileWriter(f);
        fw1.write("chandu");
        fw1.close();
        }
        catch(Exception e){
        System.out.println(e);
    }
    }

}