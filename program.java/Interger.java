import java.lang.*;
import java.util.*;
class Integer{
public static void main(){
	String x="1234";
	char y[]=x.toCharArray();
	int size=y.length;
	int i=0;
	while(i!=size){
		if(y[i]>'0' && y[i]<='9'){
			++i;
			}
			else{
				System.out.println("not a integer");
				System.exit(0);
				}
			}
			System.out.println("Integer String");
	}
	
}