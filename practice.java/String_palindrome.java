class String_palindrome {
    //    public static void main(String args[]) {
//        String a = "chandu";
//        a = a.concat("\0");
//        char y[] = a.toCharArray();
//        int count = 0;
//        int i = 0;
//        while (y[i] != '\0') {
//            count++;
//            i++;
//        }
//        System.out.printf("%d", count);
//    }
    public static void main(String arg[]) {
        //palindrome--------
        int i=0;
		String a = "121";
		 char y[] = a.toCharArray();
		 int c=Integer.parseInt(y);
		 int size=y.length;
        int rem;
        int  b=0;
      a=a.concat('\0');
        while (y[i]!= '\0') {
            rem = c % 10;
            b = rem + b * 10;
            c = c / 10;
            i++;
        }
		String z=Integer.toString(b);
		if(z==a){
			System.out.println("is a palindrome--------");
		}
		else{
			System.out.println("is not a palindrome--------");
		}
	}
}
