import java.util.NoSuchElementException;
//singly linked list with first reference only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E>
{
     private class Node
	 {
		public E data;
		public Node next;
		public Node prev;
	}
	private Node first;
	private Node prev;
	/** 
    	Constructs an empty linked list.
	*/
	public CP3LinkedList()
	{  
		first = null;
		prev = null;
	}
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = first;
		newLink.prev = null;
		first = newLink;
	}

	public void addLast(E element)
	{
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = null;
		prev = newLink.prev;
	}

	public E getFirst()
	{
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}

	public E removeFirst()
	{
		if (first == null)
			throw new NoSuchElementException();
		E element = first.data;
		first = first.next;
		return element;
	}

	public boolean isEmpty()
	{
//		if(first == null)
//			return true;
//		else
//			return false;
		return first == null;		//cleaner way of doing it.
	}

	public void print()
	{//output contents of list
		Node current = first;
		while(current != null)
		{
			System.out.println(current.data + "\n");
			current = current.next;
		}
		System.out.println("End of List");
	}

	public int size()
	{
		Node current = first;

		int counter = 0;
		while (current != null)
		{
			counter ++;
			current = current.next;
		}
		return counter;
	}
}
