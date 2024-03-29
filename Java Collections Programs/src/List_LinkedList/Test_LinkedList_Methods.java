/**
 * 
 */
package List_LinkedList;

import java.util.LinkedList;

public class Test_LinkedList_Methods{

	public static void main(String[] args) {
		
        LinkedList l1 = new LinkedList();
		
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		
		System.out.println("The contents of linkedlist l1 are: " + l1);
		
		
        LinkedList l2 = new LinkedList();
		
       // l2.add(999);
		l2.add(true);
		l2.add(56.33);
		l2.add('f');
		l2.add("good");
		l2.add(999);
		
		System.out.println("The contents of linkedlist l2 are: " + l2);
		
	    Object O1 = l1.element();
	
	    System.out.println("The element method for linkedlist l1 returns: " + O1); //returns head of linkedlist l1
	
	    Object O2 = l2.element();
	
	    System.out.println("The element method for linkedlist l2 returns: " + O2); //returns head of linkedlist l2
	    
	   int i =  l2.indexOf(1000);
	   
	 System.out.println("The first occurance of Object for linkedlist l2 returns: " + i);
	 

	    
	

	}

}
