public class Demo1 {
	public static void main(String [] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		int count = 0;
		
		for(int i =0; i < arr.length; i++) {
            if(arr[i] % 2 !=0){
                count++;
            }
		}
        System.out.println("Total odd numbers in the array: " + count);
	}
}