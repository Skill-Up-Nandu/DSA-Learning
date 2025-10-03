import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> myMap = new HashMap<>();

        // Insertion using .put()
        myMap.put("India", 130);
        myMap.put("China", 150);
        myMap.put("Usa", 30);
        myMap.put("Egypt", 60);

        // print
        System.out.println(myMap);

        // get key and values individually
        System.out.println("<<<<<- Elements Accessed by entrySet() ->>>>>");
        for (Map.Entry<String, Integer> e : myMap.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // get elements in sets
        System.out.println("<<<<<- Element accessed by KeySet()  ->>>>>");
        Set<String> keys = myMap.keySet();

        for(String key : keys ){
            System.out.println(key+" : "+myMap.get(key));
        }

        // remove any element
        System.out.println("Enter any key to get removed : ");
        String rem= sc.nextLine();
        myMap.remove(rem);
        System.out.println("UPDATED : "+myMap);
    }
}
