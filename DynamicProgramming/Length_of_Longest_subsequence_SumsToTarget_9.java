package DynamicProgramming;
import java.util.*;

// Memoization
public class Length_of_Longest_subsequence_SumsToTarget_9 {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n = nums.size();
        int[][] dp = new int[n+1][target+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans =  helper(nums,0,target,dp);

        return ans <=0  ?  -1 :ans  ;
    }
    public int helper(List<Integer> nums, int i, int remainingTarget,int[][] dp){
        // base case
        if(remainingTarget == 0){
            return 0;
        }
        if(remainingTarget<0 || i==nums.size()){
            return Integer.MIN_VALUE;
        }

        if(dp[i][remainingTarget] != -1){
            return dp[i][remainingTarget];
        }

        // Recursive call

        // Pick the element
        int include = 1 + helper(nums,i+1,remainingTarget-nums.get(i),dp);

        // Do-not pick the element
        int exclude = helper(nums,i+1,remainingTarget,dp);

        return dp[i][remainingTarget] = Math.max(include,exclude);
    }
}
