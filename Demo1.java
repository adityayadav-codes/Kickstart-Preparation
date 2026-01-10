public class Demo1 {
    public static void main (String [] args) {
        int arr[] = {10, 20, 70, -10, 50};
        int max = arr[0];
        int min = arr[0];
        for(int i =0;i <arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maximum element is: " + max);
        System.out.println("The minimum element is: " + min);
    }
}