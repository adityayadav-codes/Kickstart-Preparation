import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashOper {

    public static void main(String [] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Aadi", 1);
        map.put("Akki",2);
        map.put("Anil", 3);
        map.put("Abhi", 4);
        map.put("Chandu", 5);
        map.put("Deepu", 6);

        // for(Map.Entry<String, Integer> entry : map.entrySet()) System.out.println(entry.getKey() + " --> " +entry.getValue());
        for(String key : map.keySet()) {

            System.out.println(key + " --> "+map.get(key));
        }
    }
}