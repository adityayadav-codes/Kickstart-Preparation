public class Demo1 {

    public static void main(String [] args) {
        int [] arr = {10, 70, 30, 40, 50};
        int maxNumber = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] >maxNumber) {
                maxNumber = arr[i];
               
            }
        }
        System.out.println("The maximum number in the array is: " + maxNumber);
    }
}