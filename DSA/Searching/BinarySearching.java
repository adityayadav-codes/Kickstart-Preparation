public class BinarySearching {
    
   static void binarySearch(int arr[], int key) {

        boolean isFound = false;
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {

            int mid = (low + high)/2;
            if(arr[mid]== key) {
                System.out.println("Found at Index : "+mid);
                isFound = true;
                break;
            }
            else if(key < arr[mid] ) {
              high = mid - 1;
            }
            // 15 > 10->key element--
            else {
                low = mid + 1;
            }
        }
         if(!isFound) {
        System.out.println("Not Found!");
    }
    }

    /*
        Find second largest element-------------
    */
   static void secondLargest(int arr[]) {

    int largest = arr[0];
    int secondLargest = arr[0];

    for(int i = 0; i < arr.length; i++) {
        if(arr[i]>largest) {
            secondLargest = largest;
            largest = arr[i];
        }
        if(arr[i] > secondLargest && arr[i] != largest) {

            secondLargest = arr[i];
        }
    }
    System.out.println("Second Largest Element : "+secondLargest);
   }
    // main mthod-------------
    public static void main(String [] args) {

        int arr[] = {10,20,100,30,40,50,60,70};
        int target = 80;
        // binarySearch(arr, target);
        secondLargest(arr);
    }
}