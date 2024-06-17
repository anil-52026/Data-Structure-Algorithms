package DynamicProgramming;

public class Minimum_No_Of_OperationToMake_XAnd_Y {
    public int helper(int x, int y) {
        if (x <= y) return (y - x);
        if (x <= 0) return Integer.MAX_VALUE;
        int d11 = Integer.MAX_VALUE, d5 = Integer.MAX_VALUE;

        // divide by 5
        if (x % 5 == 0) {
            d5 = 1 + helper(x / 5, y);
        } else {
            int tx = x + (5 - (x % 5)); // closest number to x divisible by 5

            // first, increment x by (tx-x) operations
            // then do the "divide by 5" operation
            // hence total operations are (tx-x) + 1
            d5 = (tx - x) + 1 + helper(tx / 5, y);
        }

        // divide by 11
        if (x % 11 == 0) {
            d11 = 1 + helper(x / 11, y);
        } else {
            // similar to how we dealt with 5
            int tx = x + (11 - (x % 11)); // closest number to x divisible by 11
            d11 = (tx - x) + 1 + helper(tx / 11, y);
        }

        // decrement by 1
        int d1 = 1 + helper(x - 1, y);

        return Math.min(Math.min(d11, d5), d1);
    }
    public int minimumOperationsToMakeEqual(int x, int y) {
        return helper(x,y);
    }
}
