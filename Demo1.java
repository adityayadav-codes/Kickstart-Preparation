public class Demo1 {
    static int arr[] = {34, -2, 45, 29, 8, -10, 0, 99, 23};
    static int maxNumber = arr[0];
    static int minNumber = arr[0];
    public static void main(String [] args) {
        
        for(int i = 1; i <arr.length; i++) {
            if(arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
          else if (arr[i]< minNumber) {
                minNumber = arr[i];
          }  
          else {
              continue;
          }
        }
        System.out.println("Maximum number in the array is : "+maxNumber);
        System.out.println("Minimum number in the array is : "+minNumber);
    }
}