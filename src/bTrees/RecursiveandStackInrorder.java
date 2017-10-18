package bTrees;

import java.util.Stack;

public class RecursiveandStackInrorder {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);

		//inOrderRec(root);
		inOrderStack(root);

	}


	public static void inOrderRec(TreeNode t){
		if(t==null)
			return;
		inOrderRec(t.left);
		System.out.println(t.data);
		inOrderRec(t.right);
	}

	public static void inOrderStack(TreeNode t){

		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode root=t;
		s.push(t);

		while(!s.isEmpty())
		{

			if(t.left!=null){

				t=t.left;
				s.push(t);
			}

			else{
				while(t!=root && !s.isEmpty()){
					t=s.pop();
					System.out.println(t.data);
					if(t.right!=null){
						t=t.right;
						s.push(t);
						break;
					}

				}
			}
		}
	}


}
