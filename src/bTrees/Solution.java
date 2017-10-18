package bTrees;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        
        int n=Integer.parseInt(in.nextLine());
        int sum=0;
        
        for(int i=1;i<=n;i++){
        	
        	String temp=i+"";
        	int tsum=0;
        	for(int j=0;j<temp.length();j++){
        		tsum+=Math.pow(Character.getNumericValue(temp.charAt(j)),2);
             
        	}
        	//System.out.println(tsum+" ");
        	if(checkPerfectSquare(tsum)){
        		//System.out.println(i+" ");
        		sum+=i;
        	}
        	
        }
        System.out.println(sum);
    }
    
    public static boolean checkPerfectSquare(int k){
    	
    	double sqrt=java.lang.Math.sqrt(k);
    	
    	int p=(int)sqrt;
    	
    	if(Math.pow(sqrt,2) == Math.pow(p,2))
    		return true;
    	
    	else return false;
    }
}