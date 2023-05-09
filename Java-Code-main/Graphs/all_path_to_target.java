package Graphs;

import java.util.ArrayList;

public class all_path_to_target {
    static class Edge {
        int src;
        int des;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }

        public static void CreateGraph(ArrayList<Edge> graph[]) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 2));

            graph[1].add(new Edge(1, 0));
            graph[1].add(new Edge(1, 3));

            graph[2].add(new Edge(2, 0));
            graph[2].add(new Edge(2, 4));

            graph[3].add(new Edge(3, 1));
            graph[3].add(new Edge(3, 4));
            graph[3].add(new Edge(3, 5));

            graph[4].add(new Edge(4, 2));
            graph[4].add(new Edge(4, 3));
            graph[4].add(new Edge(4, 5));

            graph[5].add(new Edge(5, 3));
            graph[5].add(new Edge(5, 4));
            graph[5].add(new Edge(5, 6));
            graph[5].add(new Edge(6, 5));

        }

        // initialize the class
        public static void printallpath( ArrayList<Edge> graph[],boolean vis[], int curr, String path,int tar) {
         //base case
            if(curr == tar){
                System.out.println(path);
                return;
            }

            for(int i=0; i< graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.des]){
                    vis[curr] =true;
                    printallpath(graph, vis, curr, path, tar);
                    vis[curr] = false;
                }
            }

        }


        public static void main(String[] args) {


        }
    }
}
