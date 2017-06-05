package Practice;

public class MaxContiguousSumArray {

	
	public static void main(String a[]){
		
		//int arr[]={1,5,-1,8,-2,5,3,4,-7,18,2,9,10};
		int arr[]={-5,-3,-6,-1,-7,-9};
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			
			int next=arr[i];
			sum+=next;
if(sum>maxSum){
				
				maxSum=sum;
			}
			if(sum<0){
				
				
				sum=0;
			}

			
			
		}
		System.out.println("the max sum is"+maxSum);
		
	}
}
