import java.util.Queue;
import java.util.LinkedList;

public class BTTraversal {
	
	public static void inOrder(BinaryTreeNode node)
	{
		if(node==null) return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);	
	}
	public static void preOrder(BinaryTreeNode node)
	{
		if(node==null) return;
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);			
	}
	public static void postOrder(BinaryTreeNode node)
	{
		if(node==null) return;
		postOrder(node.left);		
		postOrder(node.right);	
		System.out.print(node.data+" ");
	}
	public static void levelOrder(BinaryTreeNode node)
	{
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(node);
		while(!queue.isEmpty())
		{
			BinaryTreeNode temp = queue.poll();
			System.out.print(temp.data+" ");
			
			if(temp.left!=null) queue.add(temp.left);
			if(temp.right!=null) queue.add(temp.right);
		}				
	}
	
	public static void main(String[] args)
	{
		BinaryTreeNode root = new BinaryTreeNode(3);
		root.left = new BinaryTreeNode(1);
		root.right = new BinaryTreeNode(6);
		root.left.left = new BinaryTreeNode(4);
		root.left.left.left = new BinaryTreeNode(3);
		root.right.right = new BinaryTreeNode(8);
		
		inOrder(root);
		System.out.println("");
		preOrder(root);
		System.out.println("");
		postOrder(root);
		System.out.println("");
		levelOrder(root);
	}
}

