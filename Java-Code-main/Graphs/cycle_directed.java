package Graphs;

import java.util.ArrayList;

public class cycle_directed {

    // step 1 ----- create structure of edge
    static class Edge
    {
        int src;
        int des;

        public Edge(int a,int b)
        {
            this.src = a;
            this.des = b;
        }
    }

    // step 2 ----- define the array which will show all the nodes
    public static void createGraph(ArrayList<Edge> graph[] )
    {
        for(int i=0;i< graph.length;i++)
        {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(2,4));
        graph[1].add(new Edge(4,8));
        graph[2].add(new Edge(8,5));
        graph[3].add(new Edge(5,6));
        graph[4].add(new Edge(6,2));
    }

    // step 3 --- declare all the variables in this function that will be needed
    public static boolean iscycle_directed(ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack_recc[])
    {
        // step 4 ---- declaration
         vis[curr] =true;
         stack_recc[curr]=true;


         //step 5 --- loop for visiting neighbours of the particular curr node
         for(int i=0 ;i<graph[curr].size();i++)
         {
             Edge e = graph[curr].get(i);

             if (stack_recc[e.des])      // if stack mai value gyi usme wo already vis hai to true
             {
                 return true;
             } else if (!vis[e.des])   // if not visited to true krwa denege
             {
                 if (iscycle_directed(graph, e.des, vis, stack_recc)) ;
                 {
                     return true;
                 }
             }

         }
         stack_recc[curr] =false;
         return false;

    }

    public static void main(String[] args){
int V =4;
ArrayList<Edge> graph[] =new ArrayList[V];
createGraph(graph);
        System.out.println(iscycle_directed(graph,0,new boolean[V],new boolean[V]));

    }

}
