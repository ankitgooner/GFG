package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SameSumArray {

	public static void main(String[] args) {
		
		int A[] = {5, 7, 4, 6};
	    int B[] = {1, 2, 3, 8};
	//	int A[] = {4, 1, 2, 1, 1, 2};
    //  int  B[] = {3, 6, 3, 3};
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		Map<Integer,Integer> mp2=new HashMap<Integer,Integer>();
		int sum1=0;
		int sum2=0;
		for(int p:A){
			sum1+=p;
			if(mp.containsKey(p)){
				mp.put(p, mp.get(p)+1);
			}
			else
				mp.put(p,1);
		}
		
		for(int p:B){
			sum2+=p;
			if(mp2.containsKey(p)){
				mp2.put(p, mp2.get(p)+1);
			}
			else
				mp2.put(p,1);
		}
		
		int diff=java.lang.Math.abs(sum2-sum1)/2;
		System.out.println("diff"+diff);
		if(mp.size()<mp2.size()){
			for(Entry<Integer,Integer> e:mp.entrySet()){
				int temp=diff+e.getKey();
				if(mp2.containsKey(temp)){
					System.out.println("swap "+e.getKey()+ " "+temp);
				}
			}}
			else{
				for(Entry<Integer,Integer> e:mp2.entrySet()){
					int temp=diff+e.getKey();
					if(mp.containsKey(temp)){
						System.out.println("swap "+e.getKey()+ " "+temp);
					}
			}
			}
		// TODO Auto-generated method stub

	}

}
