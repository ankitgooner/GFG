package traversals;

import traversals.TreeNode;

public class LevelOrder {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
//System.out.println("root"+root);
		levelOrder(root);
	}
	
	
	static void levelOrder(TreeNode root){
		
		if(root==null)
		 return;
		if(root.left==null && root.right==null){
			System.out.println(root.data);
			
			
		}
		else{
			levelOrder(root.left);
			levelOrder(root.right);
		}
		
	}

}
