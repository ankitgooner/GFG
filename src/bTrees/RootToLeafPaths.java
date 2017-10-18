package bTrees;

public class RootToLeafPaths {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		int count=0;
		int a[]=new int[5];
		int j=0;
		rootToLeaf(root,a,j);

	}
	
	public static void rootToLeaf(TreeNode node,int a[],int j){
		if(node==null){
			
			return;
		   
		}
	a[j++]=node.data;
		if(node.left==null && node.right==null){
			 tarray(a,j);
			 j--;
			 }
		else{
			rootToLeaf(node.left,a,j);
			  
			rootToLeaf(node.right,a,j);	
		}
	

	    
	
	}
	
	public static void tarray(int a[],int j){
		System.out.println();
		for(int i=0;i<j;i++)
			System.out.print(a[i]);
		
	}

}
