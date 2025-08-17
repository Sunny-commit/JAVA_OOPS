public class Sort_Even_Odd_pos {
    public static void main(String args[]){
        int a[]=new int[]{8,5,6,1,2,9};
        System.out.println("displaying the array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("sorting in even");
        int temp=0;
        for(int i=0;i<a.length;i=i+2){
            for(int j=i+2;j<a.length;j=j+2){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int temp1=0;
        System.out.println("sorting in odd and even position");
        for(int i=1;i<a.length;i=i+2){
            for(int j=i+2;j<a.length;j=j+2){
                if(a[i]>a[j]){
                    temp1=a[i];
                    a[i]=a[j];
                    a[j]=temp1;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
