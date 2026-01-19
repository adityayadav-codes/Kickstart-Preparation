public class javaString {

    public static void main(String [] args) {
        String str = "java";
       int  count =0;

        for(int i =0; i <str.length(); i++) {

            if(str.charAt(i)=='a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i)=='u') {
                
                System.out.println("Vowel: " + str.charAt(i) + " at index " + i);
                count++;
            } 
           
        }
         System.out.println("Total vowels: " + count);
    }

 }