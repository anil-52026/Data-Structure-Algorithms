package Anil;
import java.util.*;
public class BinaryTreeWIthFactor {
    public static int numFactoredBinaryTrees(int[] arr) {
        int mod = (int)Math.pow(10,9)+7;
        int n = arr.length; // variable size

        // Sort the Array
        Arrays.sort(arr);

        /*Create a HashMap called ways to store the number of ways form
        a binary tree for each element in the array. The key is the
        element itself, and the value is the number of ways.
       */
        Map<Integer,Long> map = new HashMap<>();
        long ways = 1;
        // Put elements in hashmap
        map.put(arr[0],ways);

        for(int i = 1; i<n; i++){
            long count = 1;
            // Iterating from j---i
            for(int j = 0; j<i; j++){
                // if arr[j] divides arr[i] && element present in themap
                if(arr[i]%arr[j] == 0 && map.containsKey(arr[i]/arr[j])){
                    count += (map.get(arr[j])*map.get(arr[i]/arr[j]));
                }
            }
            map.put(arr[i],count);
            ways = ways + count;
        }
        return (int)(ways%mod);


    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,10};
        System.out.println(numFactoredBinaryTrees(arr));
    }
}
