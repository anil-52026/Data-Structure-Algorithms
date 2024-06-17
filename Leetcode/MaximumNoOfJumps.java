package Leetcode;

public class MaximumNoOfJumps {
    public static int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        //int ans = 0;
        for(int i = 0; i<n; i++){
            int ans = 0;
            for(int j = i+1; j<n; j++){
                ans = Math.abs(nums[j]-nums[i]);
                if(ans<=target){
                    i = j-1;
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,6,4,1,2};
        int target = 2;
        System.out.println(maximumJumps(nums,target));
    }
}
