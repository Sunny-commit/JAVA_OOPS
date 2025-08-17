package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class program4 {
    public static void main(String args[]) throws IOException {
        File file = new File("C:\\Users\\patet\\OneDrive\\Desktop\\practice.java\\sample.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fr=new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int as;
        while ((as = br.read()) != -1) {
            System.out.print((char) as);
        }
        br.close();
    }
}
