
public class KnapSack01 {

	public static void main(String[] args) {
		
		 int values[] = {1,4,4,5,7};
		    int weights[] = {1,2,3,4,5};
		    int  W = 9;
		
System.out.println(knapsack(values,weights,W));
	}
	
	public static int knapsack(int values[],int weights[],int W){
		
		int n=values.length;
		
		int [][]res=new int[n+1][W+1];
		
		for(int i=0;i<=n;i++){
			
			for(int j=0;j<=W;j++){
				
				if(j==0 ||i==0)
					res[i][j]=0;
				
				else if(weights[i-1]<=j){
					res[i][j]=max(res[i-1][j],(values[i-1]+res[i-1][j-weights[i-1]]));
					
				}
				else if(weights[i-1]>j)
					res[i][j]=res[i-1][j];
			}
		}
		
		
		
		return res[n][W];
		
		
	}

	public static int max(int x,int y){
		
		return x>=y?x:y;
	}
}
