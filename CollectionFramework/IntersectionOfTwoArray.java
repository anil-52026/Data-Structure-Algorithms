package CollectionFramework;
import java.util.*;
public class IntersectionOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        Set<Integer> result = new HashSet<>();
        for(int i = 0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        // convert set into array
        int[] ans = new int[result.size()];

        // iterate the set
        int i = 0;
        for (Integer num : result) {
            ans[i++] = num;
        }
        return ans;

    }
}
