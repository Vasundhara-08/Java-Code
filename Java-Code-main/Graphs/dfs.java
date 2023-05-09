package Graphs;

//import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.ArrayList;

import static Graphs.Adjacency_List.*;
//import java.util.LinkedList;
//import java.util.Queue;

public class dfs {
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
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();  // now on every index of array empty arraylist will be attached
        }

        // STEP 4: now initialize the value of each edge given by its src and des

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

        /*
              1----3
            /      |   \
            0      |    5----6
            \      |   /
              2----4
         */
    }


public static void dfs(ArrayList<Edge>[] graph, int curr , boolean[] vis)
{
    System.out.println(curr + " ");
    vis[curr] = true;

    for(int i=0;i<graph[curr].size();i++)
    {
        Edge e = graph[curr].get(i);
        if(vis[e.des] == false) // if we do not apply this code then we will get into infinite loop and stack overflow ki condition aa jayegi
       dfs(graph, e.des, vis);
    }
}


    public static void main(String[] args) {
        int vertex = 7;

        // STEP 2 : create structure of array and its arraylist including edges
        ArrayList<Edge>[] graph = new ArrayList[vertex];  // there are null values in it
        createGraph(graph);
        boolean[] vis = new boolean[vertex];
        dfs(graph,0,vis);
        System.out.println();

    }
}
