import java.lang.classfile.instruction.StackInstruction;
import java.util.HashMap;

import javax.xml.transform.stax.StAXResult;

public class HashOper2 {

    static void firstNonRepElem(int []arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {

            if(map.containsKey(num)) {

                map.put(num, map.get(num) +1);
            }
            else {

                map.put(num, 1);
            }
        }

        for(int num : arr) if(map.get(num)==1) {System.out.println("First not Repeating element is "+num); break;}
    } 
   
 //   --------------------------------------------------------------
    
        static void countFrequencyUsingMap(int []arr) {

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int num : arr) {

                if(map.containsKey(num)) {

                    map.put(num, map.get(num)+1);
                }
                 else {

                map.put(num, 1);
            }
        }
        for(int key : map.keySet()) {

            System.out.println(key + " --> " +map.get(key));
            
        }
    }
 public static void main(String[] args) {
        // int []arr = {1,2,3,2,1,4};
        int [] arr = {1,2,2,3};

        // firstNonRepElem(arr);
        countFrequencyUsingMap(arr);
    }
}
