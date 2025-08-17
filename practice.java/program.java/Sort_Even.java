import java.util.*;
import java.lang.*;
class Sort_Even{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int i,j,x;
int flag=0;
System.out.println("print the maximum values to insert");
int n=sc.nextInt();
int b[]=new int[n];
System.out.println("max:"+n);
for(i=0;i<n;i++){
	b[i]=sc.nextInt();
	}
for(i=0;i<n;i++){
	System.out.println("Element at index"+i+":"+b[i]);
}
for(i=0;i<n;i++){
	if(i/2==0){
		flag=1;
	}
	else{
		flag=2;
	}
}
if(flag==1){
	for(i=0;i<n;i++){
		for(j=i+2;j<n;j++){
			if(b[i]<b[j]){
				x=b[i];
				b[i]=b[j];
				b[j]=x;
			}
		}
		i=i+2;
	}
}
if(flag==2){
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(b[i]>b[j]){
				x=b[i];
				b[i]=b[j];
				b[j]=x;
				}
			}
		}
	}

for(i=0;i<n;i++){
	System.out.println(""+b[i]);
}
}
}