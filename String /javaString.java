
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
            // System.out.println("Access Granted");
        } else {
            //  System.out.println("Access Denied");
        }
            String email = "example001@gmail.com";
            if(email.contains("@gmail.com1")) {
                System.out.println("Valid Gmail Address!!");
            } else {
                System.out.println("Invalid Gmail Address!!");
            }
    }
    void vowelsReverseOrder() {
       String str = "icecream";
         String vowels = "";
           for(int i =0; i< str.length(); i++) {
            if(str.charAt(i ) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels = vowels + str.charAt(i);
            }   
            else {
                continue;
            }
        }
            System.out.println("Vowels in the string: " + vowels);
        }
    void containsMethod2(){
        String str = "hello java";
        System.out.println(str.contains("kya haal hai"));
        
    }
    void compareString() {
	String str1 = "java";
	String str2 = "java";
		System.out.println(str1.equals(str2));
}   
    void checkPalindrom() {
        System.out.println("Mehtod !:");
	String str = "Nitin";
	boolean  isPalindrome = true;
		for(int i =0; i < str.length() / 2; i++) {
			
			if(str.charAt(i) != str.charAt(str.length()-1-i)){
				
				isPalindrome = false;
				break;
		}
	}	
	if(isPalindrome) {
		
		System.out.println("Palindrome");
	} else {
		System.out.println("Not Palindrome");
	}
}    
    void checkPalindrom1 () {
	System.out.println("Method 2 : ");
		String str = "Nitin";
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
}
    void countWords() {
	String str = "I Love java Programming";
    String[] words = str.trim().split("\\s+");
	int count = words.length;
	
		System.out.println(count);
}
    void removeSpace() {
        String str = "i love java programming";
        String result = str.replace("","");
        System.out.println(result);
    }
    void removeSpace2() {
        String str = "i love java programming";
        String result = " ";

        for(int i =0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
    void removeSpace3 (){
        String str = "hii golu";
        String result = " ";
        for( int i =0 ; i < str.length(); i++) {
            if(str.charAt(i) != ' ' ){
                    result = result+str.charAt(i);
            }
        }
        System.out.println(result);
    }
    void length() {
        String str = "java";
        System.out.println("String length is "+str.length());
    }
   void charAt() {
    String str = "java";
        System.out.println("charcter at index: "+str.charAt(0));
   }
   void equals() {
    String str1 = "java";
   String str2 = "java";
   String str3 = new String("java");
        // System.out.println(str1 == str3);
        System.out.println(str2.equals(str3));
   }
   void reversestring2() {

        String str = "hii aadi";
        for(int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
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
            //js.containsMethod();
            // js.vowelsReverseOrder();
            // js.containsMethod2();
            // js.compareString();

            // m -> A palindrome string is a string that reads the same forward and backward.
            // js.checkPalindrom();
            // js.checkPalindrom1();

            // count words in sentences
            // js.countWords();
            
            //  remove space in sentences
            // js.removeSpace();
            // js.removeSpace2();
            // js.removeSpace3();
            // js.length(); 
            // js.charAt();
            // js.equals();
            js.reversestring2();
   }
 }