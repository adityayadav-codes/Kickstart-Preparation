/*
    Linear Searching---------------------------
*/

import java.util.Scanner;

public class LinBinSearching {

   static void linearSearch(int arr[], int key) {

        System.out.println("Linear Searching through static method");
        boolean isFound = false;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == key) {

                System.out.println("found at index = "+i);
                isFound = true;
                break;
            }
        }
        if(!isFound) {

            System.out.println("Not found!");
        }
    }


    /*
        Reverse array (without extra array)----------------------------
    */
   static void revArray(int [] arr) {
    int start = 0;
    int end = arr.length - 1;

    while(start < end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;  
    }
    System.out.println("Reverse Array : ");
    for(int num : arr) System.out.println(num + " ");
   }

    public static void main(String[] args) {
        
         int array[] = new int[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements:");

        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        revArray(array);
    
    // System.out.print("Enter target element ");
    // int target = sc.nextInt();

    // linearSearch(array, target);

}

}
   