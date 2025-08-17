package Files;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Program2 {
    public static void main(String args[]) throws IOException {
        File file=new File("C:\\Users\\patet\\OneDrive\\Desktop\\practice.java\\sample.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        Scanner sc=new Scanner(file);
        while(sc.hasNext()) {
            //if we use sc.next() -it takes every space as a single tokenizer;
            //so by using sc.nextLine()-we get line by line code
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

}
