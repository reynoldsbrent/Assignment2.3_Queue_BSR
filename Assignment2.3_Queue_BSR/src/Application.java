
/**
 * This program allows the user to perform various action on the queue such as adding and removing items
 * @author brentreynolds
 * @version 10/5/2022 Fall 2022
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new Queue<String>();
		
		queue.enqueue("Brent");
		queue.enqueue("Sevastian");
		queue.enqueue("Reynolds");
		queue.enqueue("Paul");
		
		queue.print();
		System.out.println("---------------");
		queue.dequeue();
		queue.print();

	}

}
