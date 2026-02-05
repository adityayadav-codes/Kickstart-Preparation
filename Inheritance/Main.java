// Inheritance in java
class Parent {

    void showParent() {

        System.out.println("show from Parent Class");
    }
}
class Child extends Parent {

    void showChild() {
        System.out.println("show from child class");
    }
}

public class Main {
    public static void main(String [] args) {

        Child c1 = new Child();
        c1.showParent();
        c1.showChild();
    }
}