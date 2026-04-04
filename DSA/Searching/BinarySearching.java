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
    // main mthod-------------
    public static void main(String [] args) {

        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int target = 80;
        binarySearch(arr, target);
    }
}