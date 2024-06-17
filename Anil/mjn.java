package Anil;
import java.util.*;
public class mjn {
    public static int minOperations(ArrayList<Integer> nums, int k) {
        int count = 0;
        List<Integer> ans = new ArrayList<>();
        int n = nums.size();
        for(int i = 0; i<n ;i++){
            while(k!=0){
                ans.add(nums.remove(n-i-1));
                count++;
                if(nums.get(i) == k){
                    k--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);
       // ArrayList<Integer> ans = minOperations(list,2);
        System.out.println(minOperations(list,2));
    }
}
