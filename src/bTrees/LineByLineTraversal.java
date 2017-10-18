package bTrees;

public class LineByLineTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
	    root.left = new TreeNode(2);
	    root.right = new TreeNode(3);
	    root.left.left = new TreeNode(4);
	    root.left.right = new TreeNode(5);
	    root.right.right = new TreeNode(6);
System.out.println(TreeNode.height(root));
	}

}
