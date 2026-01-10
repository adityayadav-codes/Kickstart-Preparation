public class Demo1 {
public static void main(String[] args) {
    int [] num = {50, 100, 150, 200, 250};
    int sum = 0;
    for(int i =0; i <num.length; i++) {
        sum += num[i];
    }
    System.out.println("The sum is: " + sum);
}
}