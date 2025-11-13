// import java.util.Scanner;
// public class kickPre {

//     public static void main(String args[]) {

//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the number of element to be enter: ");
//         int n = sc.nextInt();
//         int [] arr = new int[n];

//             System.out.println("Enter the "+n + " " + "Elements");
//             for(int i = 0; i < n; i++) {

//                 arr[i] = sc.nextInt();
//             }
//             System.out.println("Enter the element to searck ");
//             int key = sc.nextInt();
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