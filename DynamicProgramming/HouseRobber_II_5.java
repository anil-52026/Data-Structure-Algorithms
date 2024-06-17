package DynamicProgramming;

public class HouseRobber_II_5 {
    public int helper(int[] nums,int i, int n){
        if(i > n){
            return 0;
        }
        // agar chori karta hai
        int steal = nums[i] + helper(nums,i+2,n);
        // agar chori nhi karta hai
        int skip = helper(nums,i+1,n);
        return Math.max(steal,skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        // agar 0th house par chori karta hai
        int x =  helper(nums,0,n-2);
        // agar 0th house par chori nhi karta hai
        int y = helper(nums,1,n-1);

        return Math.max(x,y);
    }

    // Memoization Technique
    public static int helperM(int[] nums,int i, int n,int[] dp){
        if(i > n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        // agar chori karta hai
        int steal = nums[i] + helperM(nums,i+2,n,dp);
        // agar chori nhi karta hai
        int skip = helperM(nums,i+1,n,dp);
        return dp[i] =  Math.max(steal,skip);
    }
    public static int robM(int[] nums) {
        int n = nums.length;

        // 1 house : return nums[0]
        if(n == 1){
            return nums[0];
        }
        int[] dp = new int[n+1];

        // Fill from index 0 to index n-2
        for(int i = 0; i<=n-2; i++){
            dp[i] = -1;
        }

        // agar 0th house par chori karta hai
        int x =  helperM(nums,0,n-2,dp);

        // Fill from index 1 to index n-1
        for(int i = 1; i<=n-1; i++){
            dp[i] = -1;
        }
        // agar 0th house par chori nhi karta hai
        int y = helperM(nums,1,n-1,dp);

        return Math.max(x,y);
    }
}
