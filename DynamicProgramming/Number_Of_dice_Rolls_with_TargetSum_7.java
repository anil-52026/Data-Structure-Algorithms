package DynamicProgramming;

import java.util.Arrays;

public class Number_Of_dice_Rolls_with_TargetSum_7 {

    // Recursive solution
    public static int numRollsToTarget(int n, int k, int target) {
        int mod = (int)Math.pow(10,9)+7;
        // Base case
        if(n == 0){
            if(target == 0){
                return 1;
            }
            else{
                return 0;
            }
        }
        int ways = 0;

        for(int face = 1; face<=k; face++){
            ways = (ways + numRollsToTarget(n-1,k,target-face)) % mod;
        }
        return ways;

    }

    // Memoization
    public static int solve(int n,int k,int target,int[][] dp){
        int mod = (int)Math.pow(10,9)+7;
        // Base case
        // there is no possible way to meet target
        if(target<0){
            return 0;
        }
        if(n == 0){
            if(target == 0){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[n][target] != -1){
            return dp[n][target];
        }
        int ways = 0;

        for(int face = 1; face<=k; face++){
            ways = (ways + solve(n-1,k,target-face,dp)) % mod;
        }
        return dp[n][target] = ways%mod;
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 6;
        int target = 7;
        // create a dp
        int[][] dp = new int[n+1][target+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        System.out.println(solve(n,6,7,dp));
    }
}
