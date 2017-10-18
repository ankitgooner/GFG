package bTrees;

public class IdenticalTrees {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.left.left = new TreeNode(4);
		root2.left.right = new TreeNode(5);
		root2.right.right = new TreeNode(6);
		boolean flag=true;
	flag=identical(root,root2,flag);
	System.out.println(flag);
	}
public static boolean identical(TreeNode t1,TreeNode t2,boolean flag){
	
	if(t1!=null && t2!=null){
		if(t1.data!=t2.data){
	
			flag=false;
			
			return flag;
		}
		
		flag=identical(t1.left,t2.left,flag);
		flag=identical(t1.right,t2.right,flag);
		
	}
	return flag;
}
}
