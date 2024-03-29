/**
 * 
 */
package List_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;


public class LinkedList_Basics {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList(); // Upcasting
		
		ll.add(100);
		ll.add(true);
		ll.add(56.33);
		ll.add('f');
		ll.add("good");
		
		System.out.println("The contents of linkedlist ll are: " + ll);
		
	ListIterator itr = ll.listIterator(0);
	
	Iterator ttt = ll.descendingIterator();
	
	while(ttt.hasNext()) {
		System.out.println(ttt.next());
	}
		
	
	

	}

}
