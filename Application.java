/** Driver class that allows the user to manipulate a queue. 
 *  @author Danny Cannon
 */
import java.util.*;
public class Application {

	public static void main(String[] args) {
		
		/** Creating queue. */
		Queue<String> palace = new Queue<String>();
		
		/** Customers already in the queue. */
		palace.enqueue("Bill");
		palace.enqueue("Alice");
		palace.enqueue("Bob");
		palace.printQueue();
		
		/** A customer is served. */
		System.out.println(palace.dequeue() + " was removed.");
		palace.printQueue();
		
		/** Jane arrives. */
		palace.enqueue("Jane");
		palace.printQueue();
		
		/** Hamad arrives. */
		palace.enqueue("Hamad");
		palace.printQueue();

		/** Two customers are served. */
		System.out.println(palace.dequeue() + " was removed.");
		palace.printQueue();
		System.out.println(palace.dequeue() + " was removed.");
		palace.printQueue();

		/** Jim arrives. */
		palace.enqueue("Jim");
		palace.printQueue();

		/** Another customer is served. */
		System.out.println(palace.dequeue() + " was removed.");
		palace.printQueue();

		/** Another customer is served. */
		System.out.println(palace.dequeue() + " was removed.");
		palace.printQueue();

	}//end main
}//end class
