package Anil;
import java.util.*;
public class SubsetSum {
    public static void helper(int[] arr, int n, int i, int sum, ArrayList<Integer> ans){
        // base case
        if(i==n){
            ans.add(sum);
            return;
        }

        // Recursive call
        helper(arr,n,i+1,sum+arr[i],ans);
        helper(arr,n,i+1,sum,ans);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> list = new ArrayList<>();
        // calculate the subset sum
        helper(num,num.length,0,0,list);

        // Sort the list using Collections.sort() method
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        ArrayList<Integer> ans = subsetSum(arr);
        System.out.println(ans);
    }

}
