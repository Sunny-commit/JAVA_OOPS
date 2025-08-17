import java.util.Scanner;
class String_anagram{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		a=a.toUpperCase();
		b=b.toUpperCase();
		int i;
		int j;
		int count=0;
		int size=a.length();
		if(a.length()==b.length()){
			for(i=0;i<size;i++){
				for(j=0;j<size;j++){
					if(a[i]==b[j]){
						count++;
						}
					}
				}
			}
			if(size==count){
				System.out.println("is a anagram");
				}
			else{
				System.out.println("is not a anagram");
				}
		}
	}