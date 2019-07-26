
public class BTLeastCommonAncestor {
	

	public static BinaryTreeNode LCA(BinaryTreeNode node, int n1 , int n2)
	{
		while(node!=null)
		{
			if(node.data>n1 && node.data>n2)
				node = node.left;
			else if(node.data<n1 && node.data<n2)
				node = node.right;
			else break;		
		}
		return node;
	}
	public static void main(String[] args)
	{
		BinaryTreeNode root = new BinaryTreeNode(10); //Binary Search Tree 
		root.left = new BinaryTreeNode(9); //All left node data will be less than root 
		root.right = new BinaryTreeNode(11); //All right node data greater than root
		root.left.left = new BinaryTreeNode(8);
		root.left.left.left = new BinaryTreeNode(7);
		root.right.right = new BinaryTreeNode(13);
		
		BinaryTreeNode node = LCA(root,9,13);
		System.out.println(node.data);
	}	

}
