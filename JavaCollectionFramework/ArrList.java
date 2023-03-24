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

// 1️⃣ Create ArrayList of integers
// 	•	Add elements
// 	•	Print using loop

public class ArrList {

    public static void main(String [] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // loop
        for(int i =0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
    }
}

/*
    2️⃣ Create LinkedList
	•	Add elements
	•	Insert element at specific position

// */
// public class ArrList {

//     public static void main(String [] args) {

//         List <Integer> list = new LinkedList<>();

//        try {

//         list .add(10);
//         list.add(20);
//         list.add(40);

//         list.add(2, 30);
//         System.out.print("Insert element at specific index via LinkedList : ");
//         System.out.println(list.get(2));

//         for(int i : list) {

//             System.out.println(i);
//         }
//     }
//         catch(IndexOutOfBoundsException ioe) {

//             System.out.println("You Cross the limit of Array⚠️");
//         } 
//     }    
// }

/