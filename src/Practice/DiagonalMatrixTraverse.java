package practice;

public class DiagonalMatrixTraverse {
	static int i=0,j=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int max=a.length-1;
		System.out.println("max "+ max);
		 
		boolean up=false;
		
		while(i!=max || j!=max){
		//	System.out.println("flag "+ up);
			
			System.out.println(a[i][j]);
			if(up){
				
				if(i<max)
					i++;
				else
					j++;
				while(i>0 && j<max){
				System.out.println(a[i--][j++]+" ");
				}
				up=false;
			}
			else{
				System.out.println(a[i][j]);
				if(j<max)
					j++;
				else 
					i++;
				while(j>0 && i<max){
					System.out.println(a[i++][j--]+" ");
					}
				up=true;
				
			}	
			
			if(i==max && j==max){
				System.out.println(a[i][j]);
				break;
			}
			}
		
		//System.out.println(" i am out" + i +" "+j);
			
		}
		
static boolean isBoundary(int x,int y,int max){
if(x==0||x==max||y==0||y==max)
	return true;
return false;
}

static void updateBoundary(int x,int y,int max){
	//System.out.println("Initial"+ " "+i+" "+j);
	   
		 if(x==0 || x==max)
		y++;
		else if(y==0 || y==max)
		x++;
	
		 
	i=x;j=y;
	
	//System.out.println(" updated boundary"+ " "+i+" "+j);
	}

}
