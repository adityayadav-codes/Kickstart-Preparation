public class LinearBinarySearching {
    
        static void LinearSearching(int [] arr , int key) {

            boolean isFound = false;

            for(int i = 0 ; i < arr.length; i++) {

                if(arr[i] == key) {

                    System.out.println("Found!");
                    isFound = true;
                    break;
                } 
            }
            if(!isFound) System.out.println("not Found");
        }
    public static void main(String[] args) {

        int arr[] = {1,2,4,3,5,7,120};
        int target = 7;

        LinearSearching(arr,target);
    }
}
