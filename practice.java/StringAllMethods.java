import java.lang.*;

public class StringAllMethods{
    public static void main(String[] args) {
        String str = new String("chandu");
	String str1=new String("chandu");
        System.out.println(str.charAt(1));
        System.out.println("the concatined string is "+str.concat("pateti"));
	System.out.println("contains method:"+str.contains("a"));
	System.out.println("the endswith method string is "+str.endsWith("ndu"));
	 System.out.println("the equals method "+str.equals(str1));//checks the string data
	 System.out.println("the == method "+(str==str1));//checks the string object
 System.out.println("the equalsIgnorecase() method "+str.equalsIgnoreCase(str1));
 System.out.println("the equals method "+str.equals(str1));
//char y[]=str.getChars();
 //System.out.println("the getChars method "+y);
 System.out.println("the hashCode method "+str.hashCode());
 System.out.println("the indexof method "+str.indexOf("n"));
// System.out.println("the getChars method "+str.getChars());
 System.out.println("the isempty method "+str.isEmpty());
 //System.out.println("the lastIndexof() method "+str.lastIndexof());
 System.out.println("the length() method "+str.length());
 System.out.println("the replace method "+str.replace("c","C"));
 //System.out.println("the spilt method "+str.spilt());
 System.out.println("the startwith method "+str.startsWith("c"));
 System.out.println("the substring method "+str.substring(2,4));
 //System.out.println("the value of  method "+str.valueOf());	

    }
}
