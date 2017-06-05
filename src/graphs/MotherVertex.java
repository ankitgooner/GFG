package graphs;

import java.util.Arrays;

public class MotherVertex {

	public static void main(String[] args) {
		 Graph g=new Graph(7);
		    g.addEdge(0, 1);
		    g.addEdge(0, 2);
		    g.addEdge(1, 3);
		    g.addEdge(4, 1);
		    g.addEdge(6, 4);
		    g.addEdge(5, 6);
		    g.addEdge(5, 2);
		    g.addEdge(6, 0);
		 
		   System.out.println("Mother is:"+findMother(g));
		   
		 
		   

	}
public static int findMother(Graph g){
 boolean visited[]=new boolean[g.V];
 int v=0;
 for(int i=0;i<g.V;i++){
	 
	 if(!visited[i]){
		 
		 DFSGraph.DFSUtils(g,i,visited);
		 v=i;
	 }
	 
	 
 }

 Arrays.fill(visited,false);
 System.out.println("checking...");
 DFSGraph.DFSUtils(g,v,visited);
 
 for (int i=0; i<g.V; i++)
     if (visited[i] == false)
         return -1;

 return v;
}
}
