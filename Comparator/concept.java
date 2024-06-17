package Comparator;
import java.util.*;
public class concept {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(3);
        pq.offer(6);
        pq.offer(7);
        pq.offer(10);
        System.out.println(pq.peek());
        System.out.println(pq.poll());

        // String works on length
        PriorityQueue<String> pq1 = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.length() == b.length()){
                    //see Details in compareTo function at javaPoint
                    return a.compareTo(b);
                }else{
                    // a.length() = 2 & b.length() = 1 and 2-1 = 1 ie.+ve matlab a ki higher priority hogi or wo
                    // pq ke last me jayega
                    return a.length() - b.length();
                }
            }
        });
        pq1.offer("3");
        pq1.offer("6");
        pq1.offer("7");
        pq1.offer("10");

//        pq1.offer("Anil");
//        pq1.offer("Anurag");

        while (!pq1.isEmpty()){
            System.out.println(pq1.poll());
        }
//        System.out.println(pq1.peek());
//        System.out.println(pq1.poll());
    }
}
