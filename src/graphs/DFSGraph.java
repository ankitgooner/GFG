package graphs;
import java.util.LinkedList;
import java.util.ListIterator;

public class DFSGraph {
	
	
	public static void DFS(Graph g,int V,int v){
		
		boolean []Visited=new boolean[V];
		
	//	Visited[v]=true;
		
		
		DFSUtils(g,v,Visited);
		 
	}

	public static void DFSUtils(Graph g,int V,boolean Visited[]){
		
		if(!Visited[V]){
			Visited[V]=true;
			System.out.println(V);
			ListIterator<Integer> li=g.getAdj()[V].listIterator();
			while(li.hasNext())
			{
				int p=li.next();
				DFSUtils(g,p,Visited);
			}
		}
		 
	 }
	public static void main(String a[]){
		
		Graph g=new Graph(4);
		 g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
		/*g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);*/
		DFS(g,7,2);
		
		
	}
}
