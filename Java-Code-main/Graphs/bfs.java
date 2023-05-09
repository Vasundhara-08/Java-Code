package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    //  STEP1 : create structure of edges that include src and des and a constructor to call them
    static class Edge {
        int src;
        int des;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    // STEP 3: to convert null values into empty set we need to link array to arraylist
    public static void createGraph(ArrayList<Adjacency_List.Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Adjacency_List.Edge>();  // now on every index of array empty arraylist will be attached
        }

        // STEP 4: now initialize the value of each edge given by its src and des

        graph[0].add(new Adjacency_List.Edge(0, 1));
        graph[0].add(new Adjacency_List.Edge(0, 2));
        graph[1].add(new Adjacency_List.Edge(1, 0));
        graph[1].add(new Adjacency_List.Edge(1, 3));
        graph[2].add(new Adjacency_List.Edge(2, 0));
        graph[2].add(new Adjacency_List.Edge(2, 4));
        graph[3].add(new Adjacency_List.Edge(3, 1));
        graph[3].add(new Adjacency_List.Edge(3, 4));
        graph[3].add(new Adjacency_List.Edge(3, 5));
        graph[4].add(new Adjacency_List.Edge(4, 2));
        graph[4].add(new Adjacency_List.Edge(4, 3));
        graph[4].add(new Adjacency_List.Edge(4, 5));
        graph[5].add(new Adjacency_List.Edge(5, 3));
        graph[5].add(new Adjacency_List.Edge(5, 4));
        graph[5].add(new Adjacency_List.Edge(5, 6));

        /*
              1----3
            /      |   \
            0      |    5----6
            \      |   /
              2----4
         */
    }

    public static void bfs(ArrayList<Adjacency_List.Edge>[] graph, int vertex) {
        // before performing bfs first step is to create queue and visited node
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[vertex];
        q.add(0);

        while (!q.isEmpty()) {
            // this includes further three steps
            int curr = q.remove();   // for curr we remove first element in the queue
            if (vis[curr] == false)   // for visit there are three steps to print vis , mark it true and third is print its neighbour

            {
                System.out.println(curr + " ");

            vis[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Adjacency_List.Edge e = graph[curr].get(i);
                q.add(e.des);
            }
            }
        }

    }

    public static void main(String args[]) {
        int vertex = 7;

        // STEP 2 : create structure of array and its arraylist including edges
        ArrayList<Adjacency_List.Edge>[] graph = new ArrayList[vertex];  // there are null values in it
        createGraph(graph);
        bfs(graph,vertex);
        System.out.println();

        // Question 1 : To find the neighbours of  any vertex
//        for(int i=0;i<graph[2].size();i++)
//        {
//            Adjacency_List.Edge e = graph[2].get(i);
//            System.out.println(e.des + " ");
//        }
    }
}

