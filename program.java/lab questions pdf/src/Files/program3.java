package Files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class program3 {
    public static void main(String args[]) throws IOException {
        File file = new File("C:\\Users\\patet\\OneDrive\\Desktop\\practice.java\\sample.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fr = new FileReader(file);
        int as;
        while ((as = fr.read()) != -1) {
            System.out.print((char)as);
        }
        fr.close();
    }
}
