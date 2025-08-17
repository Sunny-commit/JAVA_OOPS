public class Adding_Both_equal {
    public static void main(String args[]) {
        int a[] = new int[]{1, 6, 4, 2,0, 7};
        int mid=a.length/2;
        int right=0;
        int left=0;
        for (int i = 0; i <=mid; i++){
            for(int j=mid+1;j<a.length;j++){
                right=right+a[i];
                left=left+a[j];
                if(right==left){
                    System.out.println("the right and left same sum numbers are"+right+"and"+left);
                }
            }
        }

    }
}