// interface Payment
// 	•	method pay()

// Classes:
// 	•	UPI
// 	•	CreditCard

// Implement pay() differently.

interface Payment {

    void pay();
}
class UPI implements Payment {

    public void pay() {

        System.out.println("Payment via UPI");
    }
}
class CreditCard implements Payment {

    public void pay() {

        System.out.println("Payment via Cedit Card");
    }
}
// main class
public class Demo {

    public static void main(String [] args) {

        Payment obj;
        obj = new UPI();
        obj.pay();
        obj = new CreditCard();
        obj.pay();
    }
}