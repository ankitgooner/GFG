package traversals;

public class TreeNode {

	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		
		this.data=data;
		left=null;
		right=null;
	}
	
	public static int height(TreeNode node){
		
		if(node==null)
			return -1;
		int rightHeight=1+height(node.right);
		int leftHeight=1+height(node.left);
		
		if(leftHeight>rightHeight)
			return leftHeight;
		else return rightHeight;
	}
	
	
}
