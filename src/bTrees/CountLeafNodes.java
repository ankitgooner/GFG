package bTrees;

public class CountLeafNodes {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		int count=0;
		System.out.println(countLeafNodes(root));

	}

	public static int countLeafNodes(TreeNode node){
		if(node==null)
		return 0;
		if(node.left==null && node.right==null)
			return 1;
		
		return(countLeafNodes(node.left)+countLeafNodes(node.right));
		
	}
}
