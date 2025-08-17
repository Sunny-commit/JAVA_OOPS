public class Reverse_Half_array {
    public static void main(String args[]){
        int a[]=new int[]{1,3,7,5,9,80,2};
        System.out.println("printing the original array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int temp;
        int mid=a.length/2;
        System.out.println("the half reverse array");
        for(int i=0;i<mid-1;i++){
            temp=a[i];
            a[i]=a[mid-i-1];
            a[mid-i-1]=temp;
            }
        System.out.println("printing the array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
