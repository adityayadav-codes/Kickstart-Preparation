// abstract class Vehicle
// 	•	abstract method start()

// class Car extends Vehicle
// 	•	implement start()

// Main method me object bana ke call karo.

// abstract class Vehicle {

//     abstract void start();
// }
// class Car extends Vehicle {

//     void start() {

//         System.out.println("Engine start by Car Driver");
//     }
// }
// public class Demo {

//     public static void main(String [] args) {

//         Car obj = new Car();
//         obj.start();
//     }
// }

// Payment Example via Abstraction

abstract class Payment {

    abstract void pay();
}

class CreditCard extends Payment {

    void pay() {

        System.out.println("Payment via Credit Card");
    }
}
class UPI extends Payment {

    void pay() {

        System.out.println("Payment via UPI");
    }
}

public class Demo {

    public static void main(String [] args) {

        Payment obj = new UPI();
        obj.pay();

    }
}