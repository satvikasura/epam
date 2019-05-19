import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int c = in.nextInt();
            int r = in.nextInt();
            long cl = in.nextLong();
            long cr = in.nextLong();
            
            Graph graph = new Graph(c);

            for(int a1 = 0; a1 < r; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                graph.addEdge(city_1-1,city_2-1);
            }
            if(cl <= cr || r == 0){
                System.out.println(cl*c);
            }
            else{
                boolean[] visited = new boolean[c];
                long cost = 0;
                for(int i = 0; i < c; i++){
                    if(!visited[i]){
                        int roads = graph.dfs(i, visited)-1;
                    
                        cost += roads*cr;
                        cost += cl;
                    }
                }            

                System.out.println(cost); 
            }            
        }
    }
}

class Graph{
    List<Integer>[] vertices;
    
    public Graph(int count){
        vertices = new ArrayList[count];
        
        for(int i = 0; i < count; i++){
            vertices[i] = new ArrayList<Integer>();
        }
    }
    
    public void addEdge(int source, int destination){
        vertices[source].add(destination);
        vertices[destination].add(source);
    }
    
    public int dfs(int source, boolean[] visited){
        visited[source] = true;
        int roads = 1;
        
        for(Integer vertex: vertices[source]){
            if(!visited[vertex]){
                roads += dfs(vertex, visited);
            }
        }
        
        return roads;
    }
}
