package SlidingWindow;
import java.util.*;
public class CountOccurenceOfAnagrams {
    public boolean allZero(int[] count){
        for(int i = 0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }

    int search(String pat, String txt) {
        // code here
        int k = pat.length();

        int[] count = new int[26];

        // Store the frequency of pat
        for(int i = 0; i<k; i++){
            char ch = pat.charAt(i);
            count[ch-'a']++;
        }

        int ans = 0;

        int i = 0;
        int j = 0;  // start and end of Sliding window

        while(j<txt.length()){
            // calculation part
            char ch = txt.charAt(j);
            count[ch-'a']--;

            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){

                // ans wala part
                if(allZero(count)){
                    ans++;
                }

                count[txt.charAt(i) - 'a']++;

                j++;
                i++;

            }

        }
        return ans;
    }
}
