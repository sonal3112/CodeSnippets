
public class BTareMirror {
	
	public static boolean areMirror(BinaryTreeNode node1 , BinaryTreeNode node2)
	
	{
		if(node1==null && node2==null) return true;
		else if(node1==null || node2==null) return false;
		else
			return(node1.data==node2.data) && areMirror(node1.left,node2.right) && areMirror(node1.right,node2.left);
	}

	public static void main(String[] args)
	{
		BinaryTreeNode root1 = new BinaryTreeNode(10);  
		root1.left = new BinaryTreeNode(9);
		root1.right = new BinaryTreeNode(11);
		root1.left.left = new BinaryTreeNode(8);
		root1.right.right = new BinaryTreeNode(13);
		
		BinaryTreeNode root2 = new BinaryTreeNode(10);  
		root2.right = new BinaryTreeNode(9);
		root2.left = new BinaryTreeNode(11);
		root2.right.right = new BinaryTreeNode(8);
		root2.left.left = new BinaryTreeNode(13);
		
		BinaryTreeNode root3 = new BinaryTreeNode(10);  
		root3.right = new BinaryTreeNode(13);
		root3.left = new BinaryTreeNode(15);
		root3.right.right = new BinaryTreeNode(18);
		root3.left.left = new BinaryTreeNode(13);
		
		boolean bool = areMirror(root1, root2);
		if (bool==true)
		System.out.println("Trees are mirrors");
		else
			System.out.println("Trees are not mirrors");
		
		boolean bool1 = areMirror(root1, root3);
		if (bool1==true)
		System.out.println("Trees are mirrors");
		else
			System.out.println("Trees are not mirrors");

			
	}	
}
