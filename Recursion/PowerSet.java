package Recursion;
import java.util.*;
public class PowerSet {
    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        helper(nums,0,list,ans);
        return ans;
    }
    public static void helper(int[] nums,int i, List<Integer> list,List<List<Integer>>ans){

        // Base case
        if(i == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        // pick the element
        list.add(nums[i]);
        helper(nums,i+1,list,ans);

        // Do not pick the element
        list.remove(list.size()-1);
        helper(nums,i+1,list,ans);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);

    }
}

