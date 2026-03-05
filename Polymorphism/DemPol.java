// Compille - time polymorphism

// public class DemPol {
//     int add (int a , int b) {

//         return a + b;
//     }
//     int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static void main(String [] args) {
//         System.out.println("Compile-time Polymorphism");
//         DemPol obj = new DemPol();
//         System.out.println(obj.add(10, 20));
//         System.out.println(obj.add(10, 20, 30));
//     }
// }

// Run- Time Polymorphism

class Animal {
    void sound() {
        System.out.println("Animal  makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class DemPol {

        public static void main(String [] args) {

            System.out.println("Run time Polymorphism");
            Animal obj = new Dog();
            obj.sound();
        }
    
}