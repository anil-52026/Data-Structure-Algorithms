package DynamicProgramming;

public class Minimum_Difficulty_Of_Job_schedule {

    // Recursive Approach
    public static int solve(int[] jd,int n, int idx, int d){
        // Base case
        /*
        if there is only 1 day left, then you have to do all remaining jobs in that one day
        and find the max difficulty of that day and
        return it
         */
        if(d == 1){
            int maxD = jd[idx];
            for (int i = idx; i<n; i++){
                maxD = Math.max(maxD,jd[i]);
            }
            return maxD;
        }
        int MaxD = Integer.MIN_VALUE;
        int finalresult = Integer.MAX_VALUE;

        // Try one by one with all possibilities
        /*
            Take 1 job in one day
            Take 2 jobs in one day
            Take 3 jobs in one day
            and so on

            Then find the optimal one among all the results
        */
        for (int i = idx; i <= n - d; i++) {
            MaxD = Math.max(MaxD, jd[i]);
            int result = MaxD + solve(jd,n,i+1,d-1);
            finalresult = Math.min(result, finalresult);
        }
        return finalresult;
    }
    public static int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        // if length of array is less than number of day
        if(n<d){
            return -1;
        }
        return solve(jobDifficulty,n,0,d);
    }

    public static void main(String[] args) {
        int[] nums = {6,5,4,3,2,1};
        System.out.println(minDifficulty(nums,2));
    }

    // Memoiazation
    // if we will make dp as a global variable then no need to pass the argument as dp
}
