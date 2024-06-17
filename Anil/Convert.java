package Anil;
import java.util.*;
public class Convert {
    public static List<List<Integer>> findMatrix(int[] nums) {
        // create a map
        int[] map = new int[nums.length+1];
        List<List<Integer>> result = new ArrayList<>();
        for(int num : nums){
            int freq = map[num];
            if(freq == result.size()){
                result.add(new ArrayList<>());
            }
            result.get(freq).add(num);
            //result.add(num);
            map[num]++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
    }
}
