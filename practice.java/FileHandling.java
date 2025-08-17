import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
public class FileHandling{
	public static void main(String args[])throws IOException{
		File f=new File("./sample.txt");
		System.out.println(f.createNewFile());//creation of file using java 
		//f.delete();
		//FileInputStream fis=new FileInputStream(f);
		//int as;
		//while((as=fis.read())!=-1){
		//System.out.print((char)as);
		//}
		//int as;
		FileReader fr=new FileReader(f);
		//while((as=fr.read())!=-1){
		//System.out.print((char)as);
//}
BufferedReader br=new BufferedReader(fr);
br.read();
}		
}