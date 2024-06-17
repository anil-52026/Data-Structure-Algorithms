package Graph;

import java.util.Scanner;

public class Graphs {

    public static void printHelper(int edges[][],int sv,boolean[] visited){
        System.out.println(sv);
        visited[sv] = true;
        int n = edges.length;
        for(int i = 0; i<n; i++){
            if(edges[sv][i] == 1 && !visited[i]){   // agar edges hai to print it
                printHelper(edges,i,visited);
            }
        }
    }

    public static void print(int[][] edges){
        boolean visited[] = new boolean[edges.length + 1];
        for(int i = 0; i<edges.length; i++){
            if(!visited[i]){
                printHelper(edges,i,visited);
            }
        }

    }

    public static void main(String[] args) {
        int n;  // Number of nodes/vertex
        int e;  // Number of edges
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        e = s.nextInt();
        int[][] edges = new int[n][n]; // 2D array
        for(int i = 0; i<e; i++){
            int fv = s.nextInt();        // fv = first vertex
            int sv = s.nextInt();       // sv = second vertex
            edges[fv][sv]  = 1;
            edges[fv][sv] = 1 ;

        }
        print(edges);

    }
}
