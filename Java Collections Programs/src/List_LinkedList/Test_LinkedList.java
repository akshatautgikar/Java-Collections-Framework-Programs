/* Java Program to learn LinkedList Methods
 */
package List_LinkedList;

import java.util.LinkedList;

public class Test_LinkedList {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		
		System.out.println("The contents of linkedlist l1 are: " + l1);
		
		
        LinkedList l2 = new LinkedList();
		
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l2.add(500);
		
		System.out.println("The contents of linkedlist l2 are: " + l2);
		
		boolean b = l1.equals(l2);
		
		System.out.println("The equals method for l1 and l2 returns: " + b); //equals(Collection C)
		
		System.out.println("The contains method for l1 : " + l1.contains(-300)); //contains(Object)
		
		System.out.println("The containsAll method for l1 and l2: " + l1.containsAll(l2)); //containsAll(Collection C)
		
	
		

	}

}
