
public class javaString {

    void countConsonants(){
         String str = "java";
        int count =0;

            for(int i =0; i < str.length(); i++) {
                if(str.charAt(i)!= 'a' && str.charAt(i) !='e' && str.charAt(i) != 'i' && str.charAt(i)!= 'o' && str.charAt(i)!='u') {
                    System.out.println("Consonant: " +str.charAt(i) + " at index"+i);
                    count++;
                }
               
            }
             System.out.println("Total Consonants:"+count);
       }
    void reverseString() {
            String str = "java";
            for(int i = str.length()-1; i>=0; i--) {
                System.out.println(str.charAt(i));
            }
        }
    void  countVowels() {
	String str = "Java";
	int count =0;
	for(int i = 0; i < str.length(); i++) {

	if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')

		System.out.println("vowels : " + str.charAt(i) + "at index "+i);
		count ++;
	}
	System.out.println("Total Vowels "+count);
}
    void stringUpperCaseMethod() {
	String str = "java";
	String rts = str.toUpperCase();
		System.out.println(rts);
        String str1 = "hello sulluulu";
        str1 = str1.toUpperCase();
        System.out.println(str1);
}
    void stringLowerCaseMethod(){
        String str = "JAVA";
	    String str2 = str.toLowerCase();
		
		    System.out.println(str2);
            String input = "Admin";

            if(input.toLowerCase().equals("admin")) {
                 System.out.println("Access Granted");
}
    }
    void equalsMethod() {
        String str ="java";
        String str1 = "java";
        String str2 = new String("java Programming");
        System.out.println(str == str1); 
        System.out.println(str1 == str2);
        String str3 = new String("java");
        System.out.println(str.equals(str3));
        String a = "aadi";
        String b = "aadi";
        System.out.println(a == b);// true
          String c = new String("aadi"); // created in heap memory
        System.out.println(a ==c);// false, because a is in string pool and c is in heap memory
         System.out.println(a.equals(c));// true, because equals method compares the content of the string
    }
    void containsMethod() {
        String str = "my life is java";
        // System.out.println(str.contains("java"));
        // System.out.println(str.contains("python"));
        String input = "admin tera baap hai";
        if(input.contains("baap hai")) {
            System.out.println("Access Granted");
        } else {
             System.out.println("Access Denied");
        }
    }
    public static void main(String[] args) {
        javaString js = new javaString();
       // js.countConsonants();
       //js.reverseString();
      // js.countVowels();
    //   js.stringUpperCaseMethod();
        //  js.stringLowerCaseMethod();
          //js.equalsMethod();
            js.containsMethod();
        }
 }