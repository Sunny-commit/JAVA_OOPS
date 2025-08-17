class Anagram {
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
        int a = 121;
        int rem;
        int b= 0;
		int c=a;
//        a=a.concat("\0");
//        int y[] = a.toCharArray();
        while (a != 0) {
            rem = a % 10;
            b = rem + b * 10;
            a = a / 10;
            i++;
        }
		if(b==c){
			System.out.println("is a palindrome--------");
		}
		else{
			System.out.println("is not a palindrome--------");
		}
	}
}
