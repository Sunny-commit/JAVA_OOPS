package Arrays_Strings.java;

public class Largest_smallest {
    public static void main(String args[]){
        int num[]=new int[]{55,3,22,8,6,11,8,2,9};
        int smallest=num[0];
        int largest=num[0];
        for(int i=1;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        for(int i=0;i<num.length;i++){
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("the largest number is:"+largest);
        System.out.println("the smallest number is:"+smallest);
    }
}
