/*
    Move all zeros to end of array
*/
public class Demo{

    static void moveZeroesToEnd(int arr[]) {

        int j = 0;
        for(int i = 0; i < arr.length; i++) {

        if(arr[i] != 0) {       // i = 0 ❌   j =0              i = 1✅ j = 1      
            int  temp = arr[i]; // 0 -> 1 then temp = 0      |  0 -> 2 then temp 
            arr[i] = arr[j];    // arrOfi.0 -> 1 par 1       |
            arr[j] = temp;       // arrofj.0 -> 0            |

            j++;
        }
    } 
    for(int num : arr) System.out.print(num + " ");
    System.out.println();
}   

/*
    Check if array is sorted--------------------
*/
static void arraySorted(int arr[]) {

    boolean isSorted = true;

    for(int i = 0; i < arr.length - 1; i++) {

        if(arr[i] > arr[i+1]) {

            isSorted = false;
            break;
        }
    }
    if(isSorted) {

        System.out.println(" sorted");
    }
    else {
        System.out.println("not sorted");
    }
}
static void reversArrayWithPointer (int arr[]) {

    int start = 0;
    int end = arr.length - 1;
    while(start < end) {

        int temp   = arr[start];
        arr[start]  = arr[end];
        arr[end] = temp;

    start++;
    end--;
    }
    for(int num : arr) System.out.println(num);
}
/*
    Find missing number in array (basic)-----------------
*/

 
    public static void main(String[] args) {
        int arr[] = {1,3,4};
        // moveZeroesToEnd(arr);
        // arraySorted(arr);
        // missingNumber(arr);
        reversArrayWithPointer(arr);
    }
}
