
public class BTHeight {

	public static int getHeight(BinaryTreeNode node)
	{
		if(node == null) return 0;
		else {
			int lHeight = getHeight(node.left);
			int rHeight = getHeight(node.right);
			
			if(lHeight > rHeight) return (lHeight+1);
			else return (rHeight+1);
		}
	}
	
	public static void main(String[] args)
	{
		BinaryTreeNode root = new BinaryTreeNode(3);
		root.left = new BinaryTreeNode(1);
		root.right = new BinaryTreeNode(6);
		root.left.left = new BinaryTreeNode(4);
		root.left.left.left = new BinaryTreeNode(3);
		
		int height = getHeight(root);
		System.out.println("Height of BT is:"+height);
	}
}
