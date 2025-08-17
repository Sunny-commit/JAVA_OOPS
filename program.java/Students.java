//write a java program to read multiple student details (id,name,age)
//display them in the ascending order of their ages,if same ages are there arrange them in the ascending of their names
//create a class call student to retarive the student details and another class call sorting details
import java.util.*;
class Student{
    public static void main(string args[]){
        char y[]={{"1","bharath","16"},{"2","ravi","18"},{"3","rajeev","19"}};
        int i;
        int j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(y[i][j]);
            }
        }
    }
}