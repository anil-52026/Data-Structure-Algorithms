package SlidingWindow;
import java.util.*;

// Variable size Sliding Window 
public class Longest_K_uniqueCharactersSubstring {
    public int longestkSubstr(String s, int k) {
        // code here
        int n = s.length();
        int i = 0;
        int j = 0;

        int length = Integer.MIN_VALUE;

        Map<Character,Integer> map = new HashMap<>();
        while(j<n){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);

            // condition is map.size()
            if(map.size() < k){
                j++;
            }
            else if(map.size() == k){
                length = Math.max(length,j-i+1);
                j++;
            }
            else if(map.size() > k){

                while(map.size() > k){
                    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }

                j++;
            }
        }
        if(length == Integer.MIN_VALUE){
            return -1;
        }
        return length;
    }
}
