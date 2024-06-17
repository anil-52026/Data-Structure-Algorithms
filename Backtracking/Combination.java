package Backtracking;
import java.util.*;
public class Combination {
    public static void findCombination(int start,int n,  int k, List<Integer> temp, List<List<Integer>> result){
        // Base case
        if(k == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(start > n){
            return;
        }
        // take
        temp.add(start);
        // explore
        findCombination(start+1,n, k-1, temp, result);
        // remove
        temp.remove(temp.size() - 1);

        // ignore
        findCombination(start+1,n, k, temp, result);


    }
    public static List<List<Integer>> combine(int n, int k){
        List<List<Integer>> result = new ArrayList<>();
        findCombination(1,n,k,new ArrayList<>(),result);
        return result;
    }

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        List<List<Integer>> result = combine(n,k);
        System.out.println(result);

    }
}
