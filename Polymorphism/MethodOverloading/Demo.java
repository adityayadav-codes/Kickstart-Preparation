class Calculate {
    int  add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add (int a, int b, int c, int d) {
        
        return a + b + c + d;
    }
}
public class Demo {
    public static void main(String [] args) {

        Calculate obj = new Calculate();
       System.out.println(obj.add(10, 20));
       System.out.println(obj.add(10, 20, 30));
       System.out.println(obj.add(10, 20, 30, 40));
    }
}
