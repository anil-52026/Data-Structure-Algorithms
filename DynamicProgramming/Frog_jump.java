package DynamicProgramming;

public class Frog_jump {

    // Recursive Approach
    public static int solve(int n, int heights[], int i){
        // Base case
        if(i==n-1){
            return 0;
        }
        // frog can jump either (i+1)th stair or to (i+2)th stair
        int jump_one = Integer.MAX_VALUE;
        if(i+1 < n){
            jump_one = Math.abs(heights[i+1]-heights[i]) + solve(n, heights, i+1);
        }
        int jump_two = Integer.MAX_VALUE;
        if(i+2 <n){
            jump_two = Math.abs(heights[i+2]-heights[i]) + solve(n, heights, i+2);
        }
        return Math.min(jump_one,jump_two);
    }
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        return solve(n,heights,0);
    }

    // Memoization


    public static void main(String[] args) {
        int[] nums = {10,50,10};
        System.out.println(frogJump(3,nums));
    }
}
