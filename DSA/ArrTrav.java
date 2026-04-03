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

    /* 
        Linear Sewarching with static method------------------
    */

    static void linearSearch(int [] arr, int key) {

        System.out.println("Linear Searching via static method--------------------");
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
    
    /*
        Linear Searching with object---------------
    */
    void linearSearch2(int [] arr, int key) {

        System.out.println("Linear Searching via object");

        boolean isFound = false;

        for(int i = 0; i < arr.length; i++) {

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

/* 
    Binary Searching=============================
*/

static void binarySearching (int arr2[], int key) {

    int low = 0;
    int high = arr2.length - 1;
    boolean isFound = false;

    while ( low <= high) {

        int mid = (low + high)/2;
        if(arr2[mid] == key) {
            System.out.println("fund at index = " + mid);
            isFound = true;
            break;
        }
        else if(key < arr2[mid]) {

            high = mid - 1;
        }
        else {

            low = mid + 1;
        }
    }
    if(!isFound) {

        System.out.println("Not Found! ");
    }
}
}
 

public class ArrTrav {

    public static void main(String [] args) {

        int arr[] = {10,20,30,40,50,60};
        int target = 70;
        Temo.binarySearching(arr,target);
    }
}