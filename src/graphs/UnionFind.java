package graphs;

import java.util.Arrays;

public class UnionFind {
	
	public static int findRootParent(int parent[],int v){
		
		if(parent[v]==-1)return v;
		
		return findRootParent(parent,parent[v]);
	}
	
static void  union(int parent[],int src,int dest){
	
	src=findRootParent(parent,src);
	dest=findRootParent(parent,dest);
	//System.out.println(src+" "+dest);
	parent[src]=dest;
}

public static boolean isCycle(GraphEdge g){
	
	int parent[]=new int[g.V];
	Arrays.fill(parent, -1);
	
	for(int i=0;i<g.edges.length;i++){
		
		int x=findRootParent(parent,g.edges[i].src);
		int y=findRootParent(parent,g.edges[i].dest);
		
		if(x==y){
			
			
			return true;
		}
		union(parent,x,y);
	}
	return false;
}

public static boolean isCycle(GraphWeightedEdge g,int j){
	
	int parent[]=new int[g.V];
	Arrays.fill(parent, -1);
	System.out.println("New Call");
	for(int i=0;i<j;i++){
		
		int x=findRootParent(parent,g.edge[i].src);
		int y=findRootParent(parent,g.edge[i].dest);
		System.out.println(i+" "+g.edge[i].src+" "+g.edge[i].dest);
		if(x==y){
			return true;
		}
		union(parent,x,y);
	}
	return false;
}
// Driver Method
public static void main (String[] args)
{
    int V = 5, E = 4;
    GraphEdge graph = new GraphEdge(V, E);

    // add edge 0-1
    graph.edges[0].src = 0;
    graph.edges[0].dest = 1;

    // add edge 1-2
    graph.edges[1].src = 1;
    graph.edges[1].dest = 2;

    // add edge 0-2
    graph.edges[2].src = 2;
    graph.edges[2].dest = 3;

    graph.edges[3].src = 4;
    graph.edges[3].dest = 3;
    
    //graph.edges[4].src = 2;
    //graph.edges[4].dest = 4;
    if (isCycle(graph))
        System.out.println( "graph contains cycle" );
    else
        System.out.println( "graph doesn't contain cycle" );
}
}

class GraphEdge{
	
	int V;
	Edge[] edges;
	
	GraphEdge(int V,int e){
		
		
		this.V=V;
		edges= new Edge[e];
		for(int i=0;i<e;i++){
			
			edges[i]= new Edge();
		}
	}
}

class Edge{
	
	int src,dest;
}
