public class Demo1 {

    static int sum = 0;
    public static void main(String [] args) {
        int i = 1;
        while (i <=10) {
        
            sum += i;
            System.out.println("Sum after adding " + i + " is: " + sum);
            i++;
        }
    }
}