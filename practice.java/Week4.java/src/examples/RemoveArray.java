package examples;

public class RemoveArray {
    public static void main(String[] args){
        int[] A={5,3,7,2,9};
        int n=A.length;
        System.out.println("the original array is ");
        for (int j : A) {
            System.out.println(j);
        }
        int p=2;
        int[]  B=new int[n-1];
        for(int i=0;i<n;i++){
            if(i<p) {
                B[i] = A[i];
            }
            else{
                B[i-1]=A[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("final array:"+B[i]);
        }
    }
}
