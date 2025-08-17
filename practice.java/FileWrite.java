import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
class FileWrite{
	public static void main(String args[])throws IOException{
		File f=new File("./Write.txt");
		System.out.println(f.createNewFile());
		String s="chandu";
		FileOutputStream fos=new FileOutputStream(f);
		for(char ch:s.toCharArray()){
				fos.write((int)ch);
		}
		fos.flush();
	}
}