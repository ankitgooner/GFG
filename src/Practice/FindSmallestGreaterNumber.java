package practice;

import java.util.Arrays;
import java.util.Stack;

public class FindSmallestGreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num="4321";
		char[] numArray=num.toCharArray();
		char min=numArray[num.length()-1];
		int minIndex=num.length()-1;
		int index=-1;
		for(int i=num.length()-2;i>=0;i--){
			if(numArray[i]<numArray[i+1]){
				
				index=i;
				break;
			}
			
				if(numArray[i]<min)	
					minIndex=i;	
		}
		
		if(index==num.length()-2){
			swap(numArray,index,index+1);
		}
		else if(index!=-1){
			swap(numArray,index,minIndex);
			for(int i=index+1;i<numArray.length-1;i++){
				for(int j=i+1;j<numArray.length;j++){
					if(numArray[j]<numArray[i]){
						swap(numArray,i,j);
					}
					
				}
				
			}
			
		}
		
		String text="notPossible";
		if(index!=-1)			
		 text = String.copyValueOf(numArray);
		
System.out.println(text);
	}


static void swap(char[] cc,int i,int j){
	
	char temp=cc[i];
	cc[i]=cc[j];
	cc[j]=temp;
}
}
