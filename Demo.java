public class Demo {
    static double marks = 89.5;
    static String grade = "A";
    public static void main(String[] args) {
        if(marks >=33) {
            System.out.println("Student has passed with grade: " + grade);
        }
        if (marks < 33) {
            System.out.println("Student has failed.");
        }
    }
}