package DynamicProgramming;

public class Maximum_Alternating_Subsequence_sum_8 {

    // Recursive Approach
    public static long maxAlternatingSum(int[] nums) {
        // lets assume starting with 0 index i.e even so assume true
        return solve(nums,0,true);
    }
    public static long solve(int[] nums,int i, boolean flag){
        // base case
        if(i == nums.length){
            return 0;
        }
       long skip =  solve(nums,i+1,flag);
       int sum = nums[i];
       if(flag == false){
           sum = -sum;
       }
       long take = solve(nums,i+1,!flag) + sum;
       return Math.max(skip,take);
    }

    public static void main(String[] args) {
        int[] nums = {4,2,5,3};
        System.out.println(maxAlternatingSum(nums));
    }
}
