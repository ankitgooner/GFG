package practice;

import java.util.HashMap;
import java.util.Map;

public class KDistinctArraySubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int k=4;
		int arr[]={1, 2, 1, 3, 4, 2, 3};
		
		int distCount=0;
		
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		int ct=0;
		for(int i=0;i<arr.length;i++){
			
			if(mp.containsKey(arr[i])){
				mp.put(arr[i],mp.get(arr[i])+1);
			}
			else{
				mp.put(arr[i], 1);
				distCount++;
			}
			ct++;
			//System.out.println("map"+ mp.toString());
			if(ct==4){
				//System.out.println("i "+i);
				System.out.println(distCount);
				if(mp.get(arr[i-3])==1){
					//System.out.println("arr "+arr[i-3]);
					distCount--;
					mp.remove(arr[i-3]);
				}
				else{
					mp.put(arr[i-3],mp.get(arr[i-3])-1);
				}
				ct--;
				
			}
		}
		
		
	}

}
