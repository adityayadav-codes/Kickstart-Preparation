// Inheritance in java
// class Parent {

//     void showParent() {

//         System.out.println("show from Parent Class");
//     }
// }
// class Child extends Parent {

//     void showChild() {
//         System.out.println("show from child class");
//     }
// }

// public class Main {
//     public static void main(String [] args) {

//         Child c1 = new Child();
//         c1.showParent();
//         c1.showChild();
//     }
// }

// Extends Keyword:-

class Vehicle {
    String VehicleName;
    double speed;
    String model;
    double price;
    String color;
    String varient;

    // constructor
        Vehicle(String VehicleName, double speed, String model, double price, String color, String varient){     
            
            this.VehicleName = VehicleName;
            this.speed = speed;
            this.model = model;
            this.price = price;
            this.color = color;
            this.varient = varient;
        }
    
        void show() {
            System.out.println("Vehicle name "+VehicleName);
            System.out.println("Speed "+speed);
            System.out.println("model : "+model);
        }
}
