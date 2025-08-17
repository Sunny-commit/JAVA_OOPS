public class AddArray {
    public static void main(String args[]){
        int[] A={2,4,5,7,9,1};
        int n=A.length;
        for(int i=0;i<n;i++){
            System.out.println("the original array is:"+A[i]);
        }
        int[] B =new int[n+1];
        int p=2;
        int x=90;
        for(int i=0;i<n;i++){
            if(i<p){
                B[i]=A[i];
            }
            else if(i==p){
                B[i]=x;
            }
            else{
                B[i]=A[i-1];
            }
        }
        System.out.println("the final array is :");
        for(int i=0;i<n;i++){
            System.out.println(B[i]);
        }
    }

}
