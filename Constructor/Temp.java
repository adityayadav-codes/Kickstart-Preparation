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
// public class Temp {
		
// 	int a;
// 	int b;
// 		// Parameterized Constructor:
// 	Temp(int x, int y) {
		
// 		a = x; 
// 		b = y;
		
// 			System.out.println("a = "+  " "+ "b = "+b);
// 			System.out.println("Sum = "+ (a+b));
// 	}
// 	public static void main (String [] args) {
// 		System.out.println("Parametirezed Constructor: ");
// 		Temp  t1 = new Temp(10, 20);
// 	}
// }

// this keyword==========================

// public class Temp {
// 	String  name ;
// 	int age;
	
// 		Temp(String name, int age) {
// 		// this keyword
// 		this.name = name;
// 		this.age = age;
// 	}
// 		void display() {
		
// 			System.out.println("Name : "+name);
// 			System.out.println("Age  : "+age);
// 	}
	
// 	public static void main(String [] args) {
	
// 		Temp t1 = new Temp("Aditya",20);
// 		t1.display();
// 	}
// }

public class Temp {
	
	String name;
	int age;
	
		Temp(String name, int age) {
            Temp obj = this;
			obj.name = name;
			obj.age = age;
	}
		
		void display() {
		
		System.out.println("Name : "+name);
		System.out.println("Age    :"+age);
	}
	public static void main(String [] args) {
		
		Temp t1 = new Temp("Aditya", 20);
        t1.display();
	}
}