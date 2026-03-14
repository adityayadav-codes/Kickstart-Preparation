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

// 2. Payment via interface===========================================

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

// 2. Remote Control System============================================

interface Remote {

    void powerOn();
    void powerOff();
}
class Tv implements Remote {

    public void powerOn() {
        System.out.println("TV turned ON");
    }
    public void powerOff() {

        System.out.println("TV turned OFF");
    }
}
class Ac implements Remote {

    public void powerOn() {

        System.out.println("AC turned on");
    } 
    public void powerOff() {

        System.out.println("AC turned OFF");
    }
}
public class Demo {
    public static void main(String[] args) {
        
        Remote obj;
        obj = new Tv();
        obj.powerOn();
        obj.powerOff();

        obj = new Ac();
        obj.powerOn();
        obj.powerOff();
    }
}

// 3. Animal Sound via Interfaces

interface Animal {

    void sound();
}
class Dog implements Animal {

    public void sound() {

        System.out.println("Dog Barks!!");
    } 
}
class Cat implements Animal {

    public void sound() {
        Dog d = new Dog();
        d.sound();
        System.out.println("Cat meos");
        
    }
}
public class Demo {

    public static void main(String[] args) {
         
        Cat obj = new Cat();
        obj.sound();
       
    }
}