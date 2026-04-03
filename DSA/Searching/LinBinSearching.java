/*
    Linear Searching---------------------------
*/

// import java.util.Scanner;

public class LinBinSearching {

   static void linearSearch(int arr[], int key) {

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
    public static void main(String[] args) {
        
        int array[] = {10,20,30,50,70,60};
        int target = 30;
        linearSearch(array,target);
}
}