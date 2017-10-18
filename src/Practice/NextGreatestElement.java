package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreatestElement {

	public static void main(String[] args) {
		int a[]={13,12,11,10};
		
		Map<Integer,Integer> mp= new HashMap<Integer,Integer>();
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(a[0]);
		for(int i=1;i<a.length;i++){
			
			int curr=s.peek();
			
			while(curr<a[i]){
				
				
				
				
				System.out.println("curr "+curr+ "next: "+ a[i]);
				int p=s.pop();
				mp.put(p,a[i]);
				
				if(s.isEmpty())
					break;
				
				curr=s.peek();
				
			}
			
			s.push(a[i]);
			
		}
		
		while(!(s.isEmpty())){
			
			mp.put(s.pop(),-1);
		}
		
		for(int p:mp.keySet()){
			
			System.out.println("Element "+ p + " Next:"+ mp.get(p));
		}

	}

}
