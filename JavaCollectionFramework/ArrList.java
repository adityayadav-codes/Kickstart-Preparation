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

        // add()=================================
        list.add("Aditya Yadav");
        list.add("Akash Yadav"); 
        list.add("Anil Singh");
        list.add("Chandan Thakur");
        list.add("Abhishek Yadav");
        list.add("Daksh Chauhan");
        list.add("Deepak Kumar");

        // get()=================================
            System.out.println(list.get(0));
            System.out.println(list.get(1));
            System.out.println(list.get(2));
            System.out.println(list.get(3));
            System.out.println(list.get(4));
            System.out.println(list.get(5)); 

        // remove ==================================
        list.remove(2);
        System.out.println(list);     

    // size () =========================================
    System.out.println(list.size());
    }
}