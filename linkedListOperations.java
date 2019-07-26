
public class linkedListOperations {
	
	public void printList(Node head) 
    { 
        Node n = head; 
        while (n != null) { 
             System.out.print(n.data + "-> "); 
             n = n.next; 
        } 
    } 
	
	public void pushAfterNode(Node node , int data) 
    { 
        Node n = new Node(data);
        n.next = node.next;
        node.next = n;
    } 
	
	public Node midLinkedList(Node head)
	{
		Node slow = head, fast = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public Node revList(Node head)
	{
		Node prev = null;
		Node current = head;
		Node next = null;
				
		while(current!=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
}
