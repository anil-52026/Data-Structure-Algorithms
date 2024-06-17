package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        // HashSet contains unique element
        // hashSet ke andar duplicate element allow nahi hota hai
        // HashSet ke andar order define nahi hota hai

        // HashSet ke andar jitne bhi operation chal rahe hot hai like add , remove
        // wo sab O(1) me hota hai

        //Set<Integer> set = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>(); // iske karan order maintain rahta hai
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        //set.add(32);

        System.out.println(set);

        set.remove(54);
        
        System.out.println(set);

        System.out.println(set.contains(21));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);

        HashSet<String> visted = new HashSet<>();
        visted.add("0_0");
        System.out.println(visted);




    }
}
