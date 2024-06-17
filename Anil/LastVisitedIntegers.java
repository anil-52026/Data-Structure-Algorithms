package Anil;
import java.util.*;
public class LastVisitedIntegers {
    public static List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> ans = new ArrayList<>();
        helper(words,ans);
        return ans;

    }
    public static void helper(List<String> words,List<Integer> ans) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() <= 3) {
                String s = words.get(i);
                int p = Integer.parseInt(s);
                temp.add(p);
            } else {

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("prev");
        list.add("2");
        list.add("prev");
        list.add("prev");
        list.add("prev");
        System.out.println(lastVisitedIntegers(list));
    }
}
