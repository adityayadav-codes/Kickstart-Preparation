public class javaString {

    public static void main(String [] args) {
        String s = "Hello, World!";
        for(int i =0; i < s.length(); i++) {
            System.out.print(s.charAt(i)+ " ");
            System.out.println();

        }
        System.out.println("Length of the string: " + s.length());
    }
}