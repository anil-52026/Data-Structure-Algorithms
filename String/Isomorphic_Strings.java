package String;
import java.util.*;
public class Isomorphic_Strings {
//    public static boolean isIsomorphic(String s, String t) {
//        // Base case
//        if(s.length() != t.length()){
//            return false;
//        }
//        Map<Character,Character> map = new HashMap<>();
//        for(int i = 0; i<s.length(); i++){
//            char original = s.charAt(i);
//            char replacement = t.charAt(i);
//
//            if(!map.containsKey(original)){
//                if(!map.containsValue(replacement)){
//                    map.put(original,replacement);
//                }
//                else{
//                    return false;
//                }
//            }
//            else
//            {
//                char mappedCharacter = map.get(original);
//                if(mappedCharacter != replacement){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        Arrays.fill(freq1, -1);
        Arrays.fill(freq2, -1);
        for(int i = 0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if ((freq1[ch1] != -1 && freq1[ch1] != ch2) || (freq2[ch2] != -1 && freq2[ch2] != ch1))
                return false;

            freq1[ch1] = ch2;
            freq2[ch2] = ch1;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo","bar"));

    }
}
