
public class BTDiameter {
	
	public static int getDiameter(BinaryTreeNode node)
	{
		if(node == null) return 0;
		else {
			int lHeight = getHeight(node.left);
			int rHeight = getHeight(node.right);
			
			int lDia = getDiameter(node.left);
			int rDia = getDiameter(node.right);
			
			return Math.max((lHeight+rHeight+1),Math.max(lDia,rDia));
		}
	}
	
	public static int getHeight(BinaryTreeNode node)
	{
		if(node == null) return 0;
		return (1+Math.max(getHeight(node.left), getHeight(node.right)));
	}
	
	public static void main(String[] args)
	{
		BinaryTreeNode root = new BinaryTreeNode(3);
		root.left = new BinaryTreeNode(1);
		root.right = new BinaryTreeNode(6);
		root.left.left = new BinaryTreeNode(4);
		root.left.left.left = new BinaryTreeNode(3);
		root.right.right = new BinaryTreeNode(8);
		
		int dia = getDiameter(root);
		System.out.println("Diameter of BT is:"+dia);
	}
}
