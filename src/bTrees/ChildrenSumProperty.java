package bTrees;

public class ChildrenSumProperty {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(2);
		int count=0;
		System.out.println(ChildrenSum(root));

	}
	
	public static boolean ChildrenSum(TreeNode root){
		if(root==null)
			return true;
		
		if(root.left!=null || root.right!=null){
			int sum=0;
			if(root.left!=null)
				sum+=root.left.data;
			if(root.right!=null)
				sum+=root.right.data;
			
			if(sum!=root.data)return false;
		}
		
		return ChildrenSum(root.left)&&	ChildrenSum(root.right);
		
	}
}
