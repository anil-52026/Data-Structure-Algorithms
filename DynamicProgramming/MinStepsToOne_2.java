package DynamicProgramming;

import java.util.Scanner;

public class MinStepsToOne_2 {
    public static int countMinStepsToOne(int n) {

        // Base case
        if (n == 1) {
            return 0;
        }
        int op1 = Integer.MAX_VALUE, op2 = Integer.MAX_VALUE, op3 = Integer.MAX_VALUE;

        // Recursive
            op1 = 1 + countMinStepsToOne(n -1);
        if (n % 3 == 0) {
            op2 = 1 + countMinStepsToOne(n / 3);
        }
        if(n%2==0){
            op3 = 1 + countMinStepsToOne(n/2);
        }
        return Math.min(op1,Math.min(op2,op3));
    }

     // Memoization for min Steps to one
    public static int MinStepsMemoization(int n){
        // just we need to store all the unique call in a array
        int[] dp = new int[n+1];
        for(int i = 0; i<=n; i++){
            dp[i] = -1;
        }
        return helper(n,dp);
    }
    public static int helper(int n, int[] dp){
        // Modify the Base Case
        if(n == 0){
            return 0;
        }
        if( n == 1){
           return 0;
        }
        // to check
        if(dp[n] != -1){
            return dp[n];
        }
        int op1 = Integer.MAX_VALUE,op2 = Integer.MAX_VALUE, op3 = Integer.MAX_VALUE;
         op1 = 1 + helper(n-1,dp);

        if(n%3==0){
            op2 = 1 + helper(n/3,dp);
        }
        if(n%2 == 0){
            op3 = 1 + helper(n/2,dp);
        }
        dp[n] = Math.min(op1,Math.min(op2,op3));
        return dp[n];
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countMinStepsToOne(n));
        System.out.println(MinStepsMemoization(n));
    }
}
