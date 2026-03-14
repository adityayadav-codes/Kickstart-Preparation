// abstract class Vehicle
// 	•	abstract method start()

// class Car extends Vehicle
// 	•	implement start()

// Main method me object bana ke call karo.

abstract class Vehicle {

    abstract void start();
}
class Car extends Vehicle {

    void start() {

        System.out.println("Engine start by Car Driver");
    }
}
public class Demo {

    public static void main(String [] args) {

        Car obj = new Car();
        obj.start();
    }
}