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

// public class Rev {

//     public static void main(String [] args) {

//         int a = 10;
//         int b  = 20;

//         int sum = a + b;

//         System.out.println("sum. of digit is : "+sum);
//     }
// }

/*

    Array traversal========== Using for loop**********************
*/  
// public class Rev {

//     public static void main(String [] aadi) {

//         try {
//             int []arr = {10,20,30,40,50};

//             for(int i = 0; i < arr.length; i++) {

//                 System.out.print(arr[i]+ " ");
//             }
//         } catch(ArrayIndexOutOfBoundsException aioe) {

//             System.out.println("You cross array limit");
//         }
//     }
// }

/*
    Maz/Min=================
*/

// public class Rev {

//     public static void main(String [] args) {

//         int [] arr = {10,5,8,20,40,60,30,90,80};
//         int max = arr[0];
//         int min = arr[0];

//         for(int i = 1; i < arr.length; i++) {

//             if(arr[i] > max) {

//                 max = arr[i];
//             }

//             if(arr[i] < min) {

//                 min = arr[i];
//             }
//         }
//     System.out.println("Maximum = "+max);
//     System.out.println("Minimum = "+min);
//     }
// }

/*
    sum of digit======================================
*/

public class Rev {

    public static void main(String[] args) {
        
        int num = 1234;
        int sum = 0;

        while(num > 0) {

            int digit = num % 10;
            sum +=digit;
            num /=10;
        }
    System.out.println("sum of digit : "+sum);
    }
}