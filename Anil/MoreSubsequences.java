package Anil;
import java.util.*;
import java.util.HashMap;
public class MoreSubsequences {
    private static String optimised(String a, String b) {
        int subseqInA = countDistinctSubsequences(a, a.length());
        int subseqInB = countDistinctSubsequences(b, b.length());

        if (subseqInA >= subseqInB) return a;
        return b;
    }

    private static int countDistinctSubsequences(String str, int n) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int temp = map.get(ch);
               // map.put(ch, count);
                count *= 2;
                count -= temp;
            }
            else {
                map.put(ch, count);
                count *= 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String a = "egg";
        String b = "f";
        String ans = optimised(a,b);
        System.out.println(ans);
    }



}
