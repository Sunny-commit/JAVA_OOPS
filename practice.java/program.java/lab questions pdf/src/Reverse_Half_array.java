public class Reverse_Half_array {
    public static void main(String args[]){
        int a[]=new int[]{1,3,7,5,9};
        System.out.println("printing the original array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("the half reverse array");
        int mid=a.length/2;
        System.out.println("mid is "+mid);
        for(int i=0;i<a.length;i++){
            if(i!=mid){
                System.out.println(a[i]);
            }
            else{
                for(int j=4;j>=mid;--j){
                    System.out.println(a[j]);

                }
                break;
            }
        }
    }
}
