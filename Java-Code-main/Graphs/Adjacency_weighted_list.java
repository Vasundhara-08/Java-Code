package Graphs;

import java.util.ArrayList;

public class Adjacency_weighted_list {
    // define edge
    static class Edge{
        int src;
        int des;
        int weigh;
    // we created a constructor
        public Edge(int s , int d, int w)
        {
            this.src = s;
            this.des = d;
            this.weigh = w;
        }
    }

    // STEP 3: to convert null values into empty set we need to link array to arraylist
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();  // now on every index of array empty arraylist will be attached
        }

        // STEP 4: now initialize the value of each edge given by its src and des
        graph[0].add(new Edge(0,2,2));
        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));
        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));
        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));

    }

    public static void main(String args [])
    {
        // create a empty arraylist containing edge and each indexed on array
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        for(int i=0;i<graph[2].size();i++)
        {
            Edge e = graph[2].get(i);
            System.out.println(e.des + " " + e.weigh) ;
        }

    }
}
