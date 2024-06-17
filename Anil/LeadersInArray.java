package Anil;
import java.util.*;
public class LeadersInArray {
    public static List<Integer> superiorElements(int[] a) {
        // Write your code here.
        int n = a.length;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[n-1]);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > a[i + 1]) {
                list.add(a[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        List<Integer> ans = superiorElements(arr);
        System.out.println(ans);

    }
}
