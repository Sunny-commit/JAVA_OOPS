package Files;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
public class program6 {
    public static void main(String args[]) throws Exception{
        File f = new File("C:\\Users\\patet\\OneDrive\\Desktop\\program.java\\output.txt");
        if (f.exists()) {
            f.delete();
        }
        f.createNewFile();
        FileOutputStream fos=new FileOutputStream(f);
        String c="hello world";
        FileWriter fw=new FileWriter(f);
        fw.write(c);
//        char y[]=c.toCharArray();
//        for(int i=0;i<y.length;i++){
//            fos.write(y[i]);
//        }
        fw.flush();
        fw.close();
    }
}