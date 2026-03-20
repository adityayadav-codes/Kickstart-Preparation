// /* 
//     Even/Odd
// // */
// public class Rev {

//     public static void main(String [] args) {

//         try {
//             int num = 10;

//             if(num % 2 == 0) {

//                 System.out.println("Even Number");
//             } else {

//                 System.out.println("Odd Number");
//             }

//         } 
//         catch(ArithmeticException ae) {

//             System.out.println("Invalid Value entered");
//         }
//     }
// }

/*
    Prime number
*/

// public class Rev {

//     /**
//      * @param args
//      */
//     public static void main(String [] args) {

//         int num = 10;
//         boolean isPrime = true;

//         if(num <= 1) {

//             isPrime = false;
//         } 

//         for(int i=2; i < num; i++ ) {
//             if(num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }  
//         if(isPrime) {
//             System.out.println("Prime Number");
//         }     
//         if(!isPrime) {

//             System.out.println("Not Prime Number");
//         }
//     }
// }

/*
    Sum of digits
*/

public class Rev {

    public static void main(String [] args) {

        int a = 10;
        int b  = 20;

        int sum = a + b;

        System.out.println("sum. of digit is : "+sum);
    }
}