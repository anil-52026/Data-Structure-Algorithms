package SlidingWindow;
import java.util.*;
public class FindNegativeIntegerInEveryWindowSizeK {
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Long> q = new LinkedList<>();
        long[] result = new long[N-K+1];
        int i = 0;
        int j = 0;
        int in = 0;
        while(j<N){
            if(A[j] < 0){
                q.add(A[j]);
            }
            if(j-i+1 < K){
                j++;
            }
            else if(j-i+1 == K){
                if(!q.isEmpty()){
                    result[in++] = q.peek();
                }else{
                    result[in++] = 0;
                }
                if(!q.isEmpty() && A[i] == q.peek()) {
                    q.remove();
                }

                i++;
                j++;
            }

        }
        return result;
    }
}
