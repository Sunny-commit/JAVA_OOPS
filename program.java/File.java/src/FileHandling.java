//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FileHandling{
    public static void main(String args[])throws Exception{
        FileHandling f=new FileHandling("C:\\Users\\patet\\OneDrive\\Desktop\\resume.txt");//file console is created
        System.out.println(f.createNewFile());
    }
}