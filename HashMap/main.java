package HashMap;
import java.util.*;

public class main {
    public static void main(String[] args) {
        // Syntax: it has entry and entry contains key and value
        // for example: entry contains String and Integer
        Map<String,Integer> mp = new HashMap<>();

        // Adding elements in the Hashmap use put() methods
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(3,1);
        map.put(9,2);
        map.put(9,1);
        map.put(2,1);
        map.put(7,1);
        System.out.println(map.entrySet());

        // Getting the value of key from the HashMap use get() method
        // if key exist then get return the value Otherwise get return null
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null

        // Changing the value of a key in the Hashmap
        mp.put("Akash",25); // Akash -> 25
        System.out.println(mp.get("Akash")); // 25

        // Removing a pair from the Hashmap
        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("riya")); // null

        // Checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Akash")); // false
        System.out.println(mp.containsKey("Yash")); // true

        // Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika",30); // will enter
        mp.putIfAbsent("Yash",30); // will not enter

        // Get all the key in the Hashmap use keySet() method
        System.out.println(mp.keySet());      //   [lav, Rishika, Yash, Harry, Yashika]
        // Get all the values in the Hashmap use values() method
        System.out.println(mp.values());      // [17, 19, 16, 18, 30]
        // Get all entries in the Hashmap use entrySet() method
        System.out.println(mp.entrySet());    // [lav=17, Rishika=19, Yash=16, Harry=18, Yashika=30]

        // Traversing all entries of HashMap - multiple methods
        // Method - 1
        for(String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();

        // Method:2
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();

        // Method:3
            for(var e: mp.entrySet()) {
                System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
            }

            // sabkuch unordered hai it is the one of the properties of hashmap

         /* some question
          1. what happens if we put a key object in a HashMap which exists?
           Ans - it update the value
           explanation : mp("Akash",21)
                         mp("Akash",30)

           2. How many parameters are passed to the put() method for a Hashmap?
           Ans - put(key,value)


          */





    }
}
