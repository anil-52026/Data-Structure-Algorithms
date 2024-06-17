package Anil;
import java.util.*;
public class SubarraysDistinctElementSumOfSquares {
    public static int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int sum = 0;
        for(int i = 0; i<n; i++){
            Map<Integer,Integer> map = new HashMap<>();
            for(int j = i;j<n; j++){
                // Map<Integer,Integer> map = new HashMap<>();
                map.put(nums.get(j),0);
                int count = map.size();
                // for(int k = i; k<=j; k++){
                //     map.put(nums.get(k),0);

                // }
                //int count = map.size();
                sum = sum + (count*count);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(sumCounts(list));
    }
}
