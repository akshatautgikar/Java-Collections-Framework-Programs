package List_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Test_new_LinkedList{

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(250);
		ll.add(350);
		ll.add(450);
		ll.add(550);
		ll.add(650);
		
		System.out.println("The LinkedList ll is: "+ ll);
		
		ListIterator ltr = ll.listIterator();
		
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		
		ll.forEach((num)-> System.out.println(num + " "));
		
	}

}
