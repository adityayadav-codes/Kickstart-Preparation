// /* 
//     Even/Odd
// */
public class Rev {

    public static void main(String [] args) {

        try {
            int num = 10;

            if(num % 2 == 0) {

                System.out.println("Even Number");
            } else {

                System.out.println("Odd Number");
            }

        } 
        catch(ArithmeticException ae) {

            System.out.println("Invalid Value entered");
        }
    }
}

