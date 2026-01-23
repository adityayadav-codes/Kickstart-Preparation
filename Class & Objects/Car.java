public class Car {
	String color ;
	String brand;
	
		void start() {
		
			System.out.println("Car is starting!");
	}
	
	public static void main (String [] args) {

		Car c1 = new Car();
		c1.color = "red";
		c1.brand = "Honda";
		c1.start();
	}
}