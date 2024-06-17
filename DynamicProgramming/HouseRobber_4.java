package DynamicProgramming;

public class HouseRobber_4 {

    public static int helper(int[] nums,int i){
        if(i >= nums.length){
            return 0;
        }
        // agar chori karta hai
        int steal = nums[i] + helper(nums,i+2);
        // agar chori nhi karta hai
        int skip =  helper(nums,i+1);
        return Math.max(steal,skip);
    }
    public static int rob(int[] nums) {
        return helper(nums,0);
    }

    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 1};
        int[] nums = {1};
        System.out.println(rob(nums));
    }
}
