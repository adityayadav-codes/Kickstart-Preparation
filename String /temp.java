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
    public static void main(String[] args) {
        temp t1 = new temp();
        t1.countVowels();
    }
}