package constructor;
import java.util.Scanner;

class product {
    Scanner sc=new Scanner(System.in);

    String name;
    double price;
    int quantity;
    product(String name,double price,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    product(){

    }
    void setdetails(){
        System.out.println("enter product name");
        name=sc.next();

        System.out.println("enter quantity");
        quantity=sc.nextInt();

        sc.nextLine();
        System.out.println("enter price");
        price=sc.nextInt();

    }
}

public class GroceryStore  {
    product[] pro=new product[10];
    Scanner sc=new Scanner(System.in);


    static int i,numProducts=0;
    static double totalRevenue=0;

    void addproducts(){
        pro[numProducts]=new product();
        pro[numProducts++].setdetails();


        //product p=new product(n,pr,q);
    }

    void productdetails(){
        if(numProducts==0){
            System.out.println("no products are available");
        }
        for(i=0;i<numProducts;i++){
            System.out.println("product name"+pro[i].name);
            System.out.println("product quantity"+pro[i].quantity);
            System.out.println("product price"+pro[i].price);
        }
    }


    void sellProduct(int quant,String name){
        boolean flag=false;
        for(i=0;i<numProducts;i++){
            if(name.equals(pro[i].name)) {
                if (pro[i].quantity >= quant) {
                    pro[i].quantity -= quant;
                    totalRevenue = totalRevenue + (quant * pro[i].price);
                    flag = true;
                    break;
                }
                else{
                    System.out.println("quantity not available");
                }
            }
        }
        if(!flag){
            System.out.println("product is not available");
        }
    }

    void totalreven(){
        System.out.println("total revenue is"+totalRevenue);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        product prob=new product();
        GroceryStore gs=new GroceryStore();

//        product p=new product("soap",10,30);
//        GroceryStore gs= new GroceryStore();
//        gs.add(p);
//        gs.sellProduct(p,15);
//        product p1=new product("pens",3,30);
//        gs.add(p1);
//        gs.sellProduct(p,20);
//        System.out.println("total revenue is"+totalRevenue);

        System.out.println(" list ");
        int choose_op;
        boolean choice=true;
        while(choice){
            System.out.println("1)add products\n2)sell product 3)details of product 4)totalrevenue 5)");
            System.out.println("enter operation");
            choose_op=sc.nextInt();

            switch (choose_op){
                case 1:
                    gs.addproducts();
                    break;
                case 2:
                    System.out.println("enter quantity");
                    int quant=sc.nextInt();
                    System.out.println("enter name");
                    String name=sc.next();
                    gs.sellProduct(quant,name);
                    break;
                case 3:
                    gs.productdetails();
                    break;
                case 4:
                    gs.totalreven();
                    break;
                default:
                    System.out.println("invalid chosen");
            }
            System.out.println("do u want to continue(true/false)");
            choice=sc.nextBoolean();}

}

}
