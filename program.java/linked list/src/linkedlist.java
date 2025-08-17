public class linkedlist {
}
class node{
    node start;
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class creation{
    node temp;
    node insert(int data,node start){
        node temp=new temp(data);
        if(start==null){
            start=temp;
        }
        else{
            node p1=start;
            while(p1!=null){
                p1=p1.next;
            }
        p1.next=temp;
        }
        return start;
    }
}

