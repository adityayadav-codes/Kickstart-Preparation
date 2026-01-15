public class Demo1 {
	public static void main (String [] args) {
	
		int [] arr = {2,4,3,5,6,8,10,13};
        int count = 0;		
			for(int i = 0; i < arr.length; i++) {
			
				if(arr[i] % 2 == 0) {
					count ++;
			}
		}
        System.out.println("Number of even elements in the array: " + count);
	}
}