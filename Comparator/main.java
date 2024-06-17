package Comparator;

import java.util.Comparator;
import java.util.PriorityQueue;

public class main {

    public static void main(String[] args) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(1,8));
        pq.add(new Pair(1,6));
        pq.add(new Pair(1,4));

        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            System.out.println("Key is: " + temp.wt + "and value is :"+temp.age);
        }
    }
    public static class Pair implements Comparable<Pair> {
        int wt;
        int age;
        public Pair(int a, int b){
            this.wt = a;
            this.age = b;
        }

        @Override
        public int compareTo(Pair temp) {
            if(temp.wt == this.wt){
                return temp.age - this.age;
            }
            return temp.wt - this.wt;
        }
    }
}
