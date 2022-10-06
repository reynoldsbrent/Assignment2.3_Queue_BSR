
/**
 * This program allows the user to perform various action on the queue such as adding and removing items
 * @author brentreynolds
 * @version 10/5/2022 Fall 2022
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new Queue<String>();
		
		queue.enqueue("Bill");
		queue.enqueue("Alice");
		queue.enqueue("Bob");
		
		queue.print();
		System.out.println("--------------");
		
		queue.dequeue();
		queue.print();
		System.out.println("--------------");
		
		queue.enqueue("Jane");
		queue.print();
		System.out.println("--------------");
		
		queue.enqueue("Hamad");
		queue.print();
		System.out.println("--------------");
		
		queue.dequeue();
		queue.print();
		System.out.println("--------------");
		
		queue.dequeue();
		queue.print();
		System.out.println("--------------");
		
		queue.enqueue("Jim");
		queue.print();
		System.out.println("--------------");
		
		queue.dequeue();
		queue.print();
		System.out.println("--------------");
		
		queue.dequeue();
		queue.print();
		

	}

}
