package graphs;
import java.util.Iterator;
import java.util.LinkedList;

public class BFSGraph {
	
	
	public static void BFS(Graph g,int V,int v){
		
		boolean []Visited=new boolean[V];
		
		Visited[v]=true;
		
		
		 LinkedList<Integer> queue = new LinkedList<Integer>();
		 
		 queue.add(v);
		 
		 while(queue.size()!=0){
			 
			 v = queue.poll();
	            System.out.println(v+" ");
	 
	           for(int i:g.getAdj()[v]){
	        	   
	        	//  System.out.println("inside"+i);
	        	   
	        	   if(!Visited[i]){
	        		   
	        		   Visited[i]=true;
	        		   queue.add(i);
	        	   }
	           }
	            
	            
			 
		 }
	}

	public static void main(String a[]){
		
		Graph g=new Graph(7);
/*	g.addEdge(1, 4);
		g.addEdge(2, 1);
		g.addEdge(3, 2);
		g.addEdge(4, 5);
		g.addEdge(5, 4);
		g.addEdge(6, 3);*/
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
		BFS(g,7,2);
		
		
	}
}
class Graph{

int V;
private LinkedList<Integer> adj[];

Graph(int v){
	
	V=v;
	adj = new LinkedList[v];
    for (int i=0; i<v; ++i)
        adj[i] = new LinkedList();
}
public LinkedList<Integer>[] getAdj() {
	return adj;
}
public void setAdj(LinkedList<Integer>[] adj) {
	this.adj = adj;
}
public void addEdge(int v,int w){
adj[v].add(w);

	
}
}