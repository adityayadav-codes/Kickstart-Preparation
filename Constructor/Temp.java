// public class Temp {
	
// 	int a ;
// 	int b;
// 		Temp() {
			
// 			a = 10;
// 			b = 20;
// 		System.out.println("a = " +a + "  " + "b = "+b);
// 		System.out.println("Sum :  " +(a+b));
// 	}
	
// 	public static void main(String [] args ) {
		
// 		Temp t1 = new Temp();
		
// 	}
// }
public class Temp {
		
	int a;
	int b;
		// Parameterized Constructor:
	Temp(int x, int y) {
		
		a = x; 
		b = y;
		
			System.out.println("a = "+  " "+ "b = "+b);
			System.out.println("Sum = "+ (a+b));
	}
	public static void main (String [] args) {
		System.out.println("Parametirezed Constructor: ");
		Temp  t1 = new Temp(10, 20);
	}
}