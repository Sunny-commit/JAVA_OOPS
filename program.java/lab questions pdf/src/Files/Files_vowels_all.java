package Files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Files_vowels_all {
}
class FileContent{
    public static void main(String args[]) throws Exception {
        File f = new File("C:\\Users\\patet\\OneDrive\\Desktop\\program.java\\output.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        int charcount = 0;

        int vowels = 0, consonants = 0, words = 0, sentences = 0, i = 0;
        BufferedReader br = new BufferedReader(new FileReader(f));
        while ((i = br.read()) != -1) {
            if (i >= 65 && i < 91 || i >= 97 && i < 123) {
                if (i == 65 || i == 69 || i == 73 || i == 79 || i == 85 || i == 97 || i == 101 || i == 111 || i == 105 || i == 117) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            if (((char) i) == ' ') {
                words++;
            }
            if (((char) i) == '.') {
                sentences++;
            }
        }
        words++;
        System.out.println("NO of vowels="+words+"sentences="+sentences);
        br.close();
    }
}
