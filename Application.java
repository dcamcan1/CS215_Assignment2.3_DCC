import java.util.LinkedList;
import java.util.Queue;

/** Class with an interface that allows the user
 *  to manipulate the queue. 
 */
public class Application {

	public static void main(String[] args) {
		
		/** Creating queue. */
		Queue<String> palace = new LinkedList<String>();
		
		/** Customers already in the queue. */
		palace.add("Bill");
		palace.add("Alice");
		palace.add("Bob");
		
		//A customer is served
		System.out.println(palace.remove());
		System.out.println(palace);
		
		//Jane arrives
		System.out.println(palace.add("Jane"));
		System.out.println(palace);

		//Hamad arrives
		System.out.println(palace.add("Hamad"));
		System.out.println(palace);

		//Two customers are served
		System.out.println(palace.remove());
		System.out.println(palace);
		System.out.println(palace.remove());
		System.out.println(palace);

		//Jim arrives
		System.out.println(palace.add("Jim"));
		System.out.println(palace);

		//Another customer is served
		System.out.println(palace.remove());
		System.out.println(palace);

		//Another customer is served
		System.out.println(palace.remove());
		System.out.println(palace);

	}//end main
}//end class
