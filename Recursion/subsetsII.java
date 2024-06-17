package Recursion;
import java.util.*;
public class subsetsII {
    public static void findSubset(int index, int[] nums, List<Integer> ds,List<List<Integer>> anslist){
        anslist.add(new ArrayList<>(ds));
        for(int i = index; i<nums.length; i++){
            if(i!=index && nums[i] == nums[i-1]){
                continue;
            }
            // just pick the element if not found duplicate
            ds.add(nums[i]);
            findSubset(i+1,nums,ds,anslist);
            ds.remove(ds.size()-1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        // Sort the Array
        Arrays.sort(nums);
        // create a final list
        List<List<Integer>> anslist = new ArrayList<>();
        // recursion call
        // start index = 0 & empty data sutructure
        findSubset(0,nums,new ArrayList<>(),anslist);
        return anslist;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }

}
