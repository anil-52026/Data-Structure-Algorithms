package POTD;
import java.util.*;
public class SortVowelsnaString {
        public static boolean isVowel (char ch){
            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch == 'U'){
                return true;
            }
            else{
                return false;
            }
        }
        public static String sortVowels(String s) {
            // convert String to Character
            char[] ch = s.toCharArray();

            ArrayList<Character> list = new ArrayList<>();

            // Store the vowels in the temporary String
            for(int i = 0; i<s.length(); i++){
                if(isVowel(s.charAt(i))){
                    // add in list
                    list.add(s.charAt(i));
                }
            }
            // Sort the temporary string characters in ascending order.
            Collections.sort(list);

            StringBuilder ans = new StringBuilder();
            // update string
            int j = 0;
            for(int i = 0; i<s.length(); i++){
                // If the character is a vowel, replace it with the character in the string temp.
                if(isVowel(s.charAt(i))){
                    ans.append(list.get(j));
                    j++;
                }
                else{
                    ans.append(s.charAt(i));
                }
            }
            return ans.toString();
        }

    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }
    }

