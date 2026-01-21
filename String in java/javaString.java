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
        // void countVowels() {
        //     // String sr = "Hello java Programming";
        //     // int count =0;
        //     // for(int i =0; i < sr.length(); i++) {
        //     //     if(sr.charAt(i)=='a'|| sr.charAt(i)=='e'|| sr.charAt(i)=='i'|| sr.charAt(i)=='o'|| sr.charAt(i)=='u') {
        //     //         System.out.println("Vowel: " + sr.charAt(i) + " at index " + i);
        //     //         count++;
        //     //     }
        //     // }
        //     // System.out.println("Total Vowels: " + count);
        // }
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

   void stringMethod() {
	String str = "java";
	String rts = str.toUpperCase();
		System.out.println(rts);
        String str1 = "hello sulluulu";
        str1 = str1.toUpperCase();
        System.out.println(str1);
}
public static void main(String [] args) {
        javaString js = new javaString();
       // js.countConsonants();
       //js.reverseString();
      // js.countVowels();
      js.stringMethod();
    }

 }