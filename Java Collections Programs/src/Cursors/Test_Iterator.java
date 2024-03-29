/* Java Program to understand the working of Iterator Cursor
 */
package Cursors;

import java.util.ArrayList;
import java.util.Iterator;


public class Test_Iterator {

		public static void main(String[] args) {
			
			ArrayList al = new ArrayList();
			
			al.add(100);
			al.add(true);
			al.add(-23.77);
			al.add('d');
			al.add("morning");
			
			
			
			System.out.println("The contents of ArrayList al are: "+ al);
			
			
			System.out.println("Using Iterator Cursor : The contents of ArrayList al are: "+ al);
			
			Iterator itr = al.iterator();
						
			while(itr.hasNext()) {
				
				System.out.println(itr.next());			
			}
			
			itr.remove();
				
			System.out.println("The contents of ArrayList al after itr.remove() are : ");
			
	}

}
