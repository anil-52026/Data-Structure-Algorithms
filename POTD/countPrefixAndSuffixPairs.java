package POTD;
import java.util.*;
public class countPrefixAndSuffixPairs {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                // startsWith() is used check prefix And endsWith() check suffix
                if((words[j].startsWith(words[i])) && (words[j].endsWith(words[i]))){
                    count++;
                }
            }
        }
        return count;
    }

}
