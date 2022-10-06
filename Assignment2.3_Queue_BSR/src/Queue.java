
/**
 * This class contains various methods the user can use to perform action on the queue.
 * @author brentreynolds
 * @version Fall 2022 10/5/22
 * 
 */
public class Queue<T> implements QueueInterface<T>{
	LinkedList<T> myQueue = new LinkedList<T>();
	private Node<T> rear;
	private Node<T> head;
	private int size; 
	
	/**
	 *  No arg constructor initializes the head and rear of the queue to null and size to 0
	 */
	public Queue() {
		head = null;
		rear = null;
		size = 0;
	}

	
	/**
	 * This method adds an entry to the rear of the queue
	 * @param newEntry as passed in by the calling method 
	 */
	public void enqueue(T newEntry) {
		Node<T> aNode = new Node<T> ();
		aNode.setData(newEntry);
		myQueue.addNode(aNode);
		
		if(isEmpty()) {
			head = aNode.getNode();
		}
		else {
			rear.setNextNode(aNode);
		}
		rear = aNode;
		size++;
		
	}

	/**
	 * This methods removes an entry from the front of the queue
	 * @return the entry at the front of the queue
	 */
	public T dequeue() {
		T front = getFront();
		head.setData(null);
		head = head.getNextNode();
		myQueue.removeNode(head);
		size--;
		
		if(isEmpty()) {
			return null;
		}
		else {
			return front;
		}
	}

	/**
	 *This method returns the front of the queue
	 *@return the first entry in the queue
	 */
	public T getFront() {
		if(isEmpty()) {
			throw new EmptyQueueException("The queue is empty");
		}
		else {
			return head.getData();
		}
	}
	
	/**
	 * This method prints all entries in the queue
	 */
	public void print() {
		Node<T> aNode = myQueue.getList();
		while(aNode != null) {
			System.out.println(aNode.getData());
			aNode = aNode.getNextNode();
		}
	}

	/**
	 *This method returns whether the queue is empty or not
	 * @return true if the queue is empty, false otherwise
	 */
	public boolean isEmpty() {
		if(size <= 0)
			return true;
		else 
			return false;
	}

	/**
	 *This methods clears all entries from the queue
	 */
	public void clear() {
		head = null;
		rear = null;
		
	}
}
