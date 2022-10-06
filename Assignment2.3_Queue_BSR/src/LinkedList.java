
public class LinkedList<T>{
	
	// Instance variables
	Node<T> head; // Initial node in the list
	int length;   // Length of the list
	Node <T>tail; // last node of the list
	
	// Constructors
	
	/**
	 * No argument constructor initializes head, length, and tail
	 */
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	} // end constructor
	
	/**
	 * @return returns true if the list is empty
	 */
	public boolean isEmpty()
	{
		if (head==null) 
		{ 
			return true;
		}
		else 
			return false;
	}
	
	/**
	 * @return the head of the list
	 */
	public Node getList()
	{
		return head;
	}
	
	/**
	 * @param newEntry the value of aNode as sent into this method
	 */
	public void addNode(Node<T> newEntry)
	{
		if (isEmpty() ) {
			head = newEntry;
			tail=head;
			return;
		}
		tail.nextNode=newEntry;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}
	public void removeNode(Node<T> node) {
		if(!isEmpty()) {
			head.setNextNode(node);
			head = head.getNextNode();
			length--;
		}
	}

	
}
