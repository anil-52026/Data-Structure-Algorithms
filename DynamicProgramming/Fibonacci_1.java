package DynamicProgramming;

public class Fibonacci_1 {
    public static int fib(int n){
        // Base case
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // start with dp and avoid repetition
    // we have to store all unique call in array and size of array n+1

    public static int fibM(int n){
        int[] dp = new int[n+1];
        // apply a for loop to store intially -1
        for(int i = 0; i<=n; i++){
            dp[i] = -1;
        }
        return fibM(n,dp);

    }

    public static int fibM(int n, int[] dp){
        // modify the base case
//        if(n == 0 || n== 1){
//            dp[n] = n;  // storage n par n store kar rahe hai and return storage[n]
//            return dp[n];
//        }
          // No need to modify the base in memoization
        if(n<=1){
            return n;
        }

        // agar wo solve already ho  chuke hai, sirf return kar do
        if(dp[n] != -1){
            return dp[n];
        }
        // agar solve nhi hai to
        // store in storage[n]
        return dp[n] = fibM(n-1,dp) + fibM(n-2,dp);
        //return dp[n];
    }

    // Bottom - up Approach, most important approach
    // Iterative Dynamic Programming
    // now it is the time to implement to FibDp
    public static int fibDP(int n){
        // just we need to store a array and SC is O(n)
        int[] storage = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        for(int i = 2; i<=n; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }


    public static void main(String[] args) {
        int n = 56;
       // System.out.println(fibM(n));
        System.out.println(fib(n));
       // System.out.println(fibDP(n));
    }

}
