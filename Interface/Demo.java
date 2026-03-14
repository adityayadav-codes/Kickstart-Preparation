// interface Payment
// 	•	method pay()

// Classes:
// 	•	UPI
// 	•	CreditCard

// Implement pay() differently.


// interface Payment {

//     void pay();
// }
// class UPI implements Payment {

//     public void pay() {

//         System.out.println("Payment via UPI");
//     }
// }
// class CreditCard implements Payment {

//     public void pay() {

//         System.out.println("Payment via Cedit Card");
//     }
// }
// // main class
// public class Demo {

//     public static void main(String [] args) {

//         Payment obj;
//         obj = new UPI();
//         obj.pay();
//         obj = new CreditCard();
//         obj.pay();
//     }
// }

// 2. Payment via interface

interface Payment {

    void pay(double amount);
}
class UPI implements Payment {

    public void pay(double amount) {

        System.out.println("Payment via UPI : "+amount);
    }
}
class CreditCard implements Payment {

    public void pay(double amount) {

        System.out.println("Payment via Credit Card : "+amount);
    }
}
public class Demo {

    public static void main(String [] args) {

        Payment obj;
        obj = new UPI();
        obj.pay(5000);

        obj = new CreditCard();
        obj.pay(10000);
    }
}