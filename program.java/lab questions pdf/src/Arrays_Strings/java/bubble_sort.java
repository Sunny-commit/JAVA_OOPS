package Arrays_Strings.java;

public class bubble_sort {
    public static void main(String args[]){
        int a[]=new int[]{4,9,6,1,5,0,2,8,7};
        int temp=0;
        int size=a.length;
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
        System.out.println("after bobble sorting");
    for(int i=0;i<size;i++){
        System.out.println(a[i]);
    }
    }
}
