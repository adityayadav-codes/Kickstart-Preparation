import java.util.Scanner;
public class kickPre {

    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of element to be enter: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

            System.out.println("Enter the "+n + " " + "Elements");
            for(int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the element to searck ");
            int key = sc.nextInt();
            boolean found = false;

           
            for(int i =0; i < n; i++) {

                if(arr[i] == key) {

                    System.out.println("Element found at index : " + (i + 1)); 
                    found = true;
                    break;                   
                }
            }
            if(!found){
                
                System.out.println("Element not found in the array");
            }
            sc.close();
    } 
}
