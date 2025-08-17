
import java.io.File;
import java.io.FileReader;
import java.lang.Exception;

public class append1 {
    public static void main(String args[]) throws Exception{
        File f=new File("abc.txt");
        File f1=new File("xyz.txt");
        FileReader fr=new FileReader(f);
        FileReader fr1=new FileReader(f1,true);
        int i=0;
        while((i=fr.read())!=-1){
            System.out.println((char)i);
            if((i+1)==-1){
                int j=0;
                while((j=fr1.read())!=-1){
                    System.out.println((char)j);
                }
            }
        }
    }
}
