package DynamicProgramming;

import java.util.Scanner;

public class StairCaseOrClimbingStars_3 {

    // find all possible way to reach the target
    public static int stairCase(int n) {
        // Base case
        if(n<0){
            return 0;
        }
        if (n == 0) {
            return 1;
        }
//        int count1 = 0, count2 =0,count3 = 0;
//        // Recursive call
//         count1 = stairCase(n-1);
//         count2 = stairCase(n-2);
//         count3 = stairCase(n-3);
//        return count1+count2+count3;

        return stairCase(n-1) + stairCase(n-2) + stairCase(n-3);
    }

    // Tabulation Method
    public static int stair(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        if(n>0)
            dp[1] = 1;
        if(n>1)
            dp[2] = 2;
        if(n>2)
            dp[3] = 4;
        for(int i = 4;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(stairCase(n));
        System.out.println(stair(n));
    }

}
