import java.lang.*;
import java.awt.*;
class Myframe extends Frames{
	Myframe(){
		setvisible(true);
		setSize(400,300);
		setTitle("Creation of Frame");
		setBackground(color.gey);
	}
}
class FrameByExtendingFrameClass{
	public static void main(String args[]){
			Myframe m=new Myframe();
	}
}
		