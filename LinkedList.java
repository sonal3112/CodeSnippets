public class LinkedList {
	
	public static void main(String[] args)
	{
		linkedListOperations llo = new linkedListOperations();
		Node n1 = new Node(3);
		n1.next = new Node(5);
		n1.next.next = new Node(7);	
		n1.next.next.next = new Node(9);	
		//n1.next.next.next.next = new Node(11);	
		
		llo.pushAfterNode(n1,13);
			
		System.out.println("Linked List is:");
		llo.printList(n1);
		System.out.println("");
		
		Node mid = llo.midLinkedList(n1);
		System.out.println("Middle element of Linked List is :"+mid.data);
		
		Node n2 = llo.revList(n1);
		System.out.println("Reverse of Linked List is:");
		llo.printList(n2);	
	}
}
