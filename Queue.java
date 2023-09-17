/** Class representing a standard queue with
 *  enqueue and dequeue methods. 
 *  @author Danny Cannon
 *  */
public class Queue<T> extends LinkedList<T> {

	public Queue() {
		//No variables to be set
	}//end constructor
	
	//Methods
	/** Adds a node with data to an instantiated queue. 
	 *  @param thisData  Data to be added. */
	public void enqueue(T thisData) {
		Node<T> thisNode = new Node<T>();
		thisNode.setData(thisData);
		addNode(thisNode);
		System.out.println(thisData + " has arrived.");
	}//end enqueue
	
	/** Removes the node from the front of the queue. 
	 *  @return the data of the node removed 
	 *  Returns null if the queue is empty. */
	public T dequeue() {
		if (isEmpty()) {
			return null;
		}//end if
		T removed = head.getData();
		head = head.nextNode;
		length--;
		return removed;
	}//end dequeue
	
	/** Prints all nodes with their data. */
	public void printQueue() {
        if (isEmpty()) {
        	System.out.println("Queue is empty.");
            return;
        }//end if
        System.out.print("In the queue: ");                                                                                                                         
        Node<T> tempNode = head;
        while (tempNode != null) {
            System.out.print(" - " + tempNode.getData());
            tempNode = tempNode.nextNode;
        }//end while
        System.out.println("\n");
	}//end printQueue
	
}//end class
