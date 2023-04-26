package Graphs;

import java.util.ArrayList;

public class Adjacency_List {

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
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();  // now on every index of array empty arraylist will be attached
        }

        // STEP 4: now initialize the value of each edge given by its src and des

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void main(String args[]) {
        int vertex = 4;

        // STEP 2 : create structure of array and its arraylist including edges
        ArrayList<Edge> graph[] = new ArrayList[vertex];  // there are null values in it
        createGraph(graph);

        // Question 1 : To find the neighbours of  any vertex
        for(int i=0;i<graph[2].size();i++)
        {
            Edge e = graph[2].get(i);
            System.out.println(e.des + " ");
        }
    }
}
