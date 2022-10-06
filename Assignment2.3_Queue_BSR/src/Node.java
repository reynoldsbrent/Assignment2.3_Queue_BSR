
public class Node<T> {
	// Instance variable
	
	T data; // Generic data type so that this linked list can be used for any data types
	Node<T> nextNode; // Instance of the generic Node class
	
	// Constructors
	
	/**
	 * The no argument constructor sets nextNode to null
	 */
	public Node()
	{
		setNextNode(null);
		data = null;
		//data=0;
	}// end constructor
	
	// Accessors and mutators
	
	/**
	 * @param data the value of data as sent into this method 
	 */
	public void setData(T data) {
		this.data=data;
	} // end setData
	
	/**
	 * @return the data of this node
	 */
	public T getData() {
		return this.data;
	}
	
	/**
	 * @return the current value of this node
	 */
	public Node getNode() {
		return this;
	} // end getNode
	
	
	/**
	 * @param nextNode the value of nextNode as sent into this method
	 */
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}
	/**
	 * Method returns the next node
	 * @return the next Node 
	 */
	public Node getNextNode() {
		return nextNode;
	}
}