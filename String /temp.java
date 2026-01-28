public class temp {

    void countVowels() {
        String str = "java is my life";
        int count =0;
        for(int i =0; i <str.length(); i++) {
            if(str.charAt(i) == 'a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
                count++;
            }
        }
        System.out.println("total vowels in string is : "+count);
    }
    void substring() {
	String str = "javaProgramming";
	String atindex = str.substring(4);
		System.out.println(atindex);
}
// Example 1:

void dynamicIndexing() {
	String email = "aditya.yadav@gmail.com";
	int atIndex = email.indexOf('@');
	String username = email.substring(0,atIndex);
		System.out.println(username);
} 
    
public static void main(String[] args) {
        temp t1 = new temp();
        // t1.countVowels();
        // t1.substring();
        t1.dynamicIndexing();
    }
}