package List_LinkedList;

import java.util.LinkedList;

public class New_LinkedList {

	public static void main(String[] args) {
       
		LinkedList ll = new LinkedList();
		
		ll.add(100);
		ll.add(true);
		ll.add(56.33);
		ll.add('f');
		ll.add("good");
		
		System.out.println("The contents of linkedlist ll are: " + ll);
		
		ll.offer(-636);//adds the Object specified to the tail(at the end) of LinkedList
		
		ll.offerFirst("evening"); //adds the Object specified to the head of LinkedList
		
		ll.offerLast('Z');//adds the Object specified to the tail(at the end) of LinkedList
        
		System.out.println("The contents of linkedlist ll after offer, offerFirst, offerLast are: " + ll);
		
		System.out.println("The peek() for linkedlist ll are: " + ll.peek()); //peek()
		
		System.out.println("The contents of linkedlist ll after peek() are: " + ll);
		
		System.out.println("The poll() for linkedlist ll are: " + ll.poll()); //poll()
		
		System.out.println("The contents of linkedlist ll after poll() are: " + ll);
		
		
	}

}
