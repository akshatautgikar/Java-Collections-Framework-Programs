/* Java Program to understand ListIterator Cursor 
 */
package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Test {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(true);
		al.add(-23.77);
		al.add('d');
		al.add("morning");
		
		System.out.println("The contents of ArrayList al are: "+ al);
		
		System.out.println("Using ListIterator Cursor : The contents of ArrayList al are: ");
		
		ListIterator ltr = al.listIterator();
		
		System.out.println("Reading ArrayList in forward manner:  ");
		while(ltr.hasNext()) {
			
			System.out.println(ltr.next());	
			System.out.println(ltr.nextIndex());
		}
		
		System.out.println("Reading ArrayList in reverse manner:  ");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());	
			System.out.println(ltr.nextIndex());
		}
		
		
		//ltr.add(-100000);
		//System.out.println("adding Object to arraylist al using listiterator add(Object e) method: "+ al);
		
		
		
		
	}

}
