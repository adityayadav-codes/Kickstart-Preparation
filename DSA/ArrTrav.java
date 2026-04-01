// public class ArrTrav {

//     public static void main(String [] args) {

//         int [] arr = {10,20,30,40};

//         //for-loop
//         for(int i =0; i < arr.length; i++) {

//             System.out.println(arr[i]);
//         }
//     }
// }

class Temo {

    static void linearSearch(int [] arr, int key) {
        boolean isFound = false;
        for(int i =0; i < arr.length; i++) {

            if(arr[i] == key) {

                System.out.println("Found");
                isFound = true;
                break;
            }
        }

        if(!isFound) {

            System.out.println("Not Found");
        }
    }
}
public class ArrTrav {
    public static void main (String [] args) {

        int []arr = {10,20,30,40,50};
        int key = 30;
       Temo.linearSearch(arr,key);
    }
}