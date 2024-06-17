package Graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BFS {

        public static void printBFS(int[][] edges, int sv, boolean visited[]){
            Queue<Integer> q = new LinkedList<>();
            q.add(sv);
            int n = edges.length;
            visited[sv] = true;
            while(!q.isEmpty()){
                int front = q.remove() ;
//                try {
//                    front = q.remove();
//                }catch (QueueEmptyException e){
//                    return;
//                }

                System.out.println(front);
                for(int i = 0; i<n; i++){
                    if(edges[front][i] == 1 && !visited[i]){
                        q.add(i);
                        visited[i] = true;
                    }
                }
            }
        }

        public static void BFS(int edges[][]) {
            boolean visited[] = new boolean[edges.length];
            for (int i = 0; i < edges.length; i++) {
                if (!visited[i]) {
                    printBFS(edges, i, visited);
                }
                //printBFS(edges, 0, visited);
            }
        }

          public static void main(String[] args) {

                /* Write Your Code Here
                 * Complete the Rest of the Program
                 * You have to take input and print the output yourself
                 */
                int n;
                int e;
                Scanner s = new Scanner(System.in);
                n = s.nextInt();
                e = s.nextInt();
                int edges[][] = new int[n][n];
                for(int i = 0; i<e; i++){
                    int fv = s.nextInt();
                    int sv = s.nextInt();
                    edges[fv][sv] = 1;
                    edges[sv][fv] = 1;
                }
                BFS(edges);
            }

        }

