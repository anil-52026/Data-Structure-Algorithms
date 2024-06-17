package Anil;

public class KnapSack {
    /* A Naive recursive implementation
  of 0-1 Knapsack problem */

        // A utility function that returns
        // maximum of two integers
        static int max(int a, int b) { return (a > b) ? a : b; }

        // Returns the maximum value that
        // can be put in a knapsack of
        // capacity W
        static int knapSack(int W, int wt[], int val[], int n)
        {
            // Base Case
            if (n == 0 || W == 0)
                return 0;

            // If weight of the nth item is
            // more than Knapsack capacity W,
            // then this item cannot be included
            // in the optimal solution
            if (wt[n - 1] > W)
                return knapSack(W, wt, val, n - 1);

                // Return the maximum of two cases:
                // (1) nth item included
                // (2) not included
            else
                return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1),
                        knapSack(W, wt, val, n - 1));
        }

        // Driver code
        public static void main(String args[])
        {
            int profit[] =  { 80, 90,92,98,85,75,60 };
            int weight[] =  { 7,9,6,8,8,5,2 };
            int Capacity = 25;
            int n = profit.length;
            System.out.println(knapSack(Capacity, weight, profit, n));
        }
    }
    /*This code is contributed by Rajat Mishra */


