package bTrees;

public class SizeoftheTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		int count=0;
		System.out.println(size(root));

	}

	public static int size(TreeNode t){
		
		if(t==null)
			return 0;
		else
	
	
	return 1+size(t.left)+size(t.right);
	  
	}
	
}
