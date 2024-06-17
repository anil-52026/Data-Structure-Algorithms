package Heap;
import java.util.*;
public class KClosestPointToOrigin {
    public static class Pair implements Comparable<Pair>{
        int dist;
        int x;
        int y;
        int i;
        // Making a constructor
        public Pair(int dist, int x, int y, int i){
            this.dist = dist;
            this.x = x;
            this.y = y;
            this.i = i;
        }
        @Override
        public int compareTo(Pair a){
           return a.dist - this.dist;

        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>();
//        Arrays.sort(points, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] a, int[] b) {
//               int x = a[0]*a[0] + a[1]*a[1];
//               int y = b[0]*b[0] + b[1]*b[1];
//               return  x-y;
//            }
//        });

//        System.out.println("We wish to print Points Array");
//        for(int i = 0 ; i<points.length; i++){
//            System.out.println(Arrays.toString(points[i]));
//        }

        for(int i = 0; i<n; i++){
            int x = points[i][0];
            int y = points[i][1];
            int dist = (x*x + y*y);
            // where i is the index
            maxHeap.offer(new Pair(dist,x,y,i));

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int[][] ans = new int[k][2];
        int i = 0;
//        while(!maxHeap.isEmpty()){
//            Pair temp = maxHeap.poll();
//            System.out.println("X= " + temp.x + " Y= " + temp.y);
//        }


        while(!maxHeap.isEmpty()){
            Pair temp = maxHeap.poll();
            //ans[i++] = new int[]{points[temp.i][0],points[temp.i][1]};
            ans[i][0] = temp.x;
            ans[i][1] = temp.y;
            i++;
        }

        return ans;

    }

    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        System.out.println(Arrays.deepToString(kClosest(points,2)));

    }
}
