package Arrays_Strings.java;

public class MatrixMultiplication {
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6},{6,1,9}};
        int b[][]={{1,6,4},{7,9,3},{2,5,7}};
        int c[][]=new int[3][3];
     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             c[i][j]=0;
             for(int k=0;k<3;k++){
                 c[i][j]+=a[i][k]*b[k][j];
             }
             System.out.println(c[i][j]+"");
         }
         System.out.println();
     }
    }

}
