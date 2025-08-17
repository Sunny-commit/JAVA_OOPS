package Files;
import java.io.File;
import java.io.IOException;
public class FileHandling {
    public static void main(String args[]) throws IOException{
File f=new File("C:\\Users\\patet\\OneDrive\\Documents\\resume.txt");
System.out.println(f.createNewFile());//it is a boolean statement that shows the file is created or not.
        //it is used to create a new file.
System.out.println(f.exists());
  // f.delete(); //it is used to delete the file
        //f.isHidden()----it is used to  know that the file is hidden or not.
        //f.canWrite()----it is used to know that the file is in read mode or write mode.
        //f.setWriteable(true)-- this method is used to change the read mode to write mode.
        //File f=new File("./resume.txt");-we can give address is like this also.
        }
}
