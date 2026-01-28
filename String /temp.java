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
// Example 2:

void fileExtensionExtract() {
	String file = "resume.final.version.pdf";
	int dot = file.lastIndexOf('.');
	String extension  = file.substring(dot + 1);
		System.out.println(extension);
} 
// Example 3 :
void maskSensitivedata () {
	
	String card = "1234-5678-9012-3456";
	String masked = card.substring(0,4) + "****-****-" +card.substring(15);
		
		System.out.println(masked);  
} 

// Example 4:

void  otpValidationLogic () {
	
	String msg ="Your OTP is 876543. Do not share.";
	int start = msg.indexOf("is")+3;
	int end = start + 6;
		
		System.out.println(msg.substring(start,end));
}
public static void main(String[] args) {
        temp t1 = new temp();
        // t1.countVowels();
        // t1.substring();
        // t1.dynamicIndexing();
        // t1.fileExtensionExtract();
        // t1.maskSensitivedata();
        t1.otpValidationLogic();
    }
}