package graphs;

import java.util.ListIterator;
import java.util.Stack;

public class TopologicalSort {

	public static void main(String arg[]){
		
		Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
 
        System.out.println("Following is a Topological " +
                           "sort of the given graph");
        
      Stack<Integer> s=new Stack<Integer>();
      boolean visited[]=new boolean[g.V];
      for(int i=0;i<g.V;i++){
    	  
    	  topologicalSort(visited,s,i,g);
      }
      
      while (s.empty()==false){
          System.out.print(s.pop() + " ");
  }
        //g.topologicalSort();
	}
	
	
	public static void topologicalSort(boolean visited[],Stack s,int v,Graph g){
		
		if(!visited[v]){
			
			ListIterator<Integer> lt=g.getAdj()[v].listIterator();
while(lt.hasNext()){
        		
	topologicalSort(visited,s,lt.next(),g);
        	}
visited[v]=true;
s.push(v);
		}
		
		
	}
}
