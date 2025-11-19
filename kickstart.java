// import java.util.Scanner;
// public class kickPre {

//     public static int main(String args[]) {

//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the number of element to be enter: ");
//         int n = sc.nextint();
//         int [] arr = new int[n];

//             System.out.println("Enter the "+n + " " + "Elements");
//             for(int i = 0; i < n; i++) {

//                 arr[i] = sc.nextint();
//             }
//             System.out.println("Enter the element to searck ");
//             int key = sc.nextint();
//             boolean found = false;

           
//             for(int i =0; i < n; i++) {

//                 if(arr[i] == key) {

//                     System.out.println("Element found at index : " + (i + 1)); 
//                     found = true;
//                     break;                   
//                 }
//             }
//             if(!found){
                
//                 System.out.println("Element not found in the array");
//             }
//             sc.close();
//     } 
// }


// binary search 
// import java.util.Scanner;
// public  class kickstart {
	
// 	static int binarySearch(int arr [], int x ) {
		
// 		 int low =0, high = arr.length-1;
// 		// int low =0, high = arr.length -1;
		
// 	while(low <= high) {
			
// 			int mid = low + (high - low)/2;
				
// 				if(arr[mid] == x) {
		
// 					return mid;
// 			} else  if (arr[mid] <  x) {
		
// 				low = mid + 1;
// 			}	else {
				
// 				high = mid -1;
// 			}
// 		}
// 		return -1;
// 	}
		
// 		//main method
// 	public static int main(String args []) {
			
// 		int arr[] = {2, 3, 4, 10, 40};
			
// 			int x = 11;
// 			int result = binarySearch(arr,x);
				
// 				if(result  == -1) {
				
// 				System.out.println("Element not found");
// 		} else {
			
// 				System.out.println("Element found at index " + result);
// 		}
// 	}
// }

//sorting in java
//bubble sort

// import java.util.Scanner;
// public class kickstart {

//     public static int main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements:");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Bubble sort logic
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }

//         System.out.println("Sorted array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         sc.close();
//     }
// }

// //Insertion sort
// import java.util.Scanner;
// public class kickstart {
// 	public static int main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the number of elements:");
// 		int n = sc.nextInt();

// 		int[] arr = new int[n];
// 		System.out.println("Enter " + n + " elements:");
// 		for (int i = 0; i < n; i++) {
// 			arr[i] = sc.nextInt();
// 		}

// 		// Insertion sort logic
// 		for (int i = 1; i < n; i++) {
// 			int key = arr[i];
// 			int j = i - 1;

// 			while (j >= 0 && arr[j] > key) {
// 				arr[j + 1] = arr[j];
// 				j = j - 1;
// 			}
// 			arr[j + 1] = key;
// 		}

// 		System.out.println("Sorted array:");
// 		for (int i = 0; i < n; i++) {
// 			System.out.print(arr[i] + " ");
// 		}

// 		sc.close();
// 	}
// }

// 2-D array
// public class kickstart {

// 	public static int main (String args []) {

// 		int sum =0;
// 		int [] [] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

// 		System.out.println("2-D array is: ");
// 		for(int i =0; i < arr.length; i++) {
// 			for(int j =0; j <  arr [i].length; j++){
// 				System.out.print(arr[i][j] + " ");
// 			}	
// 			System.out.println();
// 	}
// 	for(int i =0 ; i < arr.length; i++) {

// 		for ( int j =0; j < arr [i].length; j++) {

// 			sum += arr [i][j];

// 		}	
// 	}
// 	System.out.println("Sum of all elements in 2-D array is: " + sum);
// }
// }


//Day 5: Funtion overloading in java
// public class kickstart {
    
//      public int func() {
        
//         int a = 10;
//         int b = 30;
//         int c = a + b;
//        return c;
//     }
//    public int func(int x, int y) {
        
//         int a = x;
//         int b = y;
//         int c = a * b;
//        return c; 
//     }
//     public static int main(String args[]) {
        
//         kickstart obj = new kickstart();
		
// 			System.out.println("Function overloading in java:");
// 			System.out.println(obj.func());
// 			System.out.println(obj.func(10, 20));
// 	}
// 	}

// public class kickstart{
    
//         public int display(int x) {
//             return x;
//     }
//         public String  display(String s) {
//             return s;
//     }
//         public static void main (String args []) {
//             kickstart kick = new kickstart();
//             System.out.println(kick.display(100));
//             System.out.println(kick.display("Aadi"));
//     }
// // }
// public class kickstart {
    
//     public static void staticMethod() {
        
//         System.out.println("Static Method");
//     }
//     public void nonStaticMethod() {
        
//         System.out.println("Non - Static Method"); 
//     }
    
//     public static void main(String args []) {
//             staticMethod();
//             kickstart kick = new kickstart();
//             kick.nonStaticMethod();
       
//     }
// // }

// public class kickstart {
    
//     String name;
//     int age;
//     double marks;
//         public  void printdetials(){
            
//             System.out.println("Name : "+name);
//             System.out.println("Age  : "+age);
//             System.out.println("marks : "+marks);
//     }
//     public static void main(String args []) {
    
       
//         kickstart kick = new kickstart();
// 		kick.name = "Aadi";
// 		kick.age = 21;
// 		kick.marks = 89.5;
//         kick.printdetials();
//     }
// }

// public class kickstart {

// 	public int add(int a, int b) {
// 		return a + b;
// 	}
// 	public int subrract(int a, int b) {
// 		return a - b;
// 	}
// 	public int multiply(int a, int b) {
// 		return a * b;
// 	}
// 	public double divide(double  a, double  b) {
// 		return a / (double)b;
// 	}
// 	public static void main(String[] args) {
// 		kickstart kick = new kickstart();
// 		System.out.println("Addition : " + kick.add(10, 5));
// 		System.out.println("Subtraction : " + kick.subrract(10, 5));
// 		System.out.println("Multiplication : " + kick.multiply(10, 5));
// 		System.out.println("Division : " + kick.divide(10, 5));
// 	}
//}

// Day 6:
public class kickstart {

		String name ;
		int age;
		//default constructor 
	public kickstart() {
		
		name = "Unknown";
		age = 17;
		System.out.println("Default Constructor Called");
	}
	public static void main(String[] args) {
		kickstart kick = new kickstart();
		System.out.println("Name : "+kick.name);
		System.out.println("Age  : "+kick.age);

	}

}