import java.util.*;
/*

Create an ArrayList of student names:
	•	Add 5 names
	•	Print all names
	•	Remove one name
	•	Print updated list

*/


public class ArrList {

    public static void main(String [] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Brijnath Yadav");
        list.add("Vidya Devi"); 
        list.add("Suman Yadav");
        list.add("Soni Yadav");
        list.add("Golu Yadav");
        list.add("Babu Yadav");

            System.out.println(list.get(0));
            System.out.println(list.get(1));
            System.out.println(list.get(2));
            System.out.println(list.get(3));
            System.out.println(list.get(4));
            System.out.println(list.get(5));            
    }
}