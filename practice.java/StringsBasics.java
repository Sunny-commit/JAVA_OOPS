public class StringsBasics {
    public static void  main(String[] args) {
        String A = "chandu is a good boy";
        int size = A.length();
        char y[]=A.toCharArray();

        for (int i = 0; i < size; i++) {
            System.out.println(y[i]);
        }
		int count=0;
		System.out.println("no of words in a given strings");
		for(int i=0;i<A.length();i++){
			while(y[i]!=' ' && y[i+1]!=' '){
				count++;
				i++;
		}
System.out.println(count);
}
}
}