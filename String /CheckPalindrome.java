public  class CheckPalindrome {
    public static void main(String[] args) {
        
        String str = "radar";
        String rev = " ";

        for(int i = str.length()-1; i >= 0; i--) {

            rev = rev + str.charAt(i);
        }
    
    }
}