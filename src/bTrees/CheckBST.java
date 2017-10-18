package bTrees;

public class CheckBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(7);
		/*root.left = new TreeNode(5);
		root.right = new TreeNode(18);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(6);
		root.right.left = new TreeNode(14);*/
		TreeNode temp = new TreeNode(-1);
		System.out.println(checkBST(root,temp));
		
		

	}

	public  static boolean checkBST(TreeNode n,TreeNode temp){
		
		
		
		if(n==null){
			
			return true;
			
		}
		
		
		boolean fleft=checkBST(n.left,temp);
		System.out.println("Cmparing "+ n.data+" with "+temp.data );
		if(n.data<=temp.data){
			
			return false;
			
		}
		
			temp.data=n.data;
		
			//System.out.println(n.data+" right "+data );
		boolean fright=checkBST(n.right,temp);
		
		return fleft&&fright;
}

}