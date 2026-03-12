import java.lang.ref.Reference;

class Animal {
    void sound() {
        System.out.println("Anumal makes sound!");
    }
}
class Dog extends Animal {

    void sound() {

        System.out.println("Dog Barks!");
    }
}

public class Main {

    public static void main(String [] args) {

        // Dog obj = new Dog();     Reference and Object both are Child Class
        Animal obj = new Dog();    // Reference  is Parent class & Object Child Class
        obj.sound();                                      
    }
}