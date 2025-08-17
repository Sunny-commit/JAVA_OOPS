package Class_and_Encapsulation.java;

 class tt {
    int length;
    int breadth;
   tt(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    int Area(){
        return length*breadth;
    }
}
class Rectangle{
    public static void main(String args[]){
        tt obj=new tt(4,5);
        tt obj1=new tt(8,2);
        System.out.println(obj.Area());

    }
}

