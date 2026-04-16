// public class BubbleSort {
//     public static void main(String [] args) {

//         int []arr = {20,10,40,30};

//         for(int i = 0; i < arr.length - 1; i++) {

//             for(int j = 0 ; j < arr.length - 1; j++) {

//                 if(arr[j] > arr[j + 1]) {

//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//              }
//         }

//         for(int num : arr) System.out.print(num +" ");
//         System.out.println();

//     }
// }

public class BubbleSort {

    static void bubbleSortWithDesc(int []arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - 1; j++) {

                if(arr[j] < arr[j + 1]) {

                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr) System.out.print(num + " ");
    }
   static void bubbleSortWithAsc(int arr[]) {
        
         for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - 1; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int num : arr) System.out.print(num + " ");
    }
    public static void main(String[] args) {
    
        int []arr = {50,60,80,90,70,30};

        System.out.println("Ascending Order : ");
        bubbleSortWithAsc(arr);
        System.err.println();
        System.out.println("Descending Order : ");
        bubbleSortWithDesc(arr);
    }
}  