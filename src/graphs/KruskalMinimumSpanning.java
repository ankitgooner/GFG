package graphs;

import java.util.Arrays;

public class KruskalMinimumSpanning {
	
	public static void KruskalMST(GraphWeightedEdge g){
		
		Arrays.sort(g.edge);
		int resultantEdges=4;
		GraphWeightedEdge temp=new GraphWeightedEdge(g.V,resultantEdges);
		int j=0;
for(int i=0;i<g.edge.length;i++){
			
			
		System.out.println(g.edge[i].src+" here "+g.edge[i].dest);
		}
		for(int i=0;i<g.edge.length;i++){
			
			
			temp.edge[j++]=g.edge[i];
			if((UnionFind.isCycle(temp,j))){
				
				j--;
			}
		}
		 for (int i = 0; i < j; i++){
	            System.out.println(temp.edge[i].src+" -- "+temp.edge[i].dest+" == "+
	            		temp.edge[i].weight);
	    }
	}

	 public static void main (String[] args)
	    {
	 
	        /* Let us create following weighted graph
	                 10
	            0--------1
	            |  \     |
	           6|   5\   |15
	            |      \ |
	            2--------3
	                4       */
	        int V = 4;  // Number of vertices in graph
	        int E = 5;  // Number of edges in graph
	        GraphWeightedEdge graph = new GraphWeightedEdge(V, E);
	 
	        // add edge 0-1
	        graph.edge[0].src = 0;
	        graph.edge[0].dest = 1;
	        graph.edge[0].weight = 10;
	 
	        // add edge 0-2
	        graph.edge[1].src = 0;
	        graph.edge[1].dest = 2;
	        graph.edge[1].weight = 6;
	 
	        // add edge 0-3
	        graph.edge[2].src = 0;
	        graph.edge[2].dest = 3;
	        graph.edge[2].weight = 5;
	 
	        // add edge 1-3
	        graph.edge[3].src = 1;
	        graph.edge[3].dest = 3;
	        graph.edge[3].weight = 15;
	 
	        // add edge 2-3
	        graph.edge[4].src = 2;
	        graph.edge[4].dest = 3;
	        graph.edge[4].weight = 4;
	 
	       KruskalMST(graph);
	    }

}
class GraphWeightedEdge{
	
	int V;
	WeightedEdge[] edge;
	
	GraphWeightedEdge(int V,int e){
		
		
		this.V=V;
		edge= new WeightedEdge[e];
		for(int i=0;i<e;i++){
			
			edge[i]= new WeightedEdge();
		}
	}
}

class WeightedEdge implements Comparable<WeightedEdge>{
	
	int src,dest,weight;

	@Override
	public int compareTo(WeightedEdge o) {
		return this.weight-o.weight;
	}
}
