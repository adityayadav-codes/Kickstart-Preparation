// import java.util.Scanner;
// public class kickPre {

//     public static void main(String args[]) {

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
// 	public static void main(String args []) {
			
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

//     public static void main(String[] args) {
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

//Insertion sort
import java.util.Scanner;
public class kickstart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Insertion sort logic
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		System.out.println("Sorted array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}