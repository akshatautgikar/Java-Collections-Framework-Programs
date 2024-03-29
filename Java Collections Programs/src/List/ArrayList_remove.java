/* add(), remove(i), remove(Object), removeAll(Collection C)
 */
package List;

import java.util.*;

public class ArrayList_remove {

	
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		

		al.add("10");
		al.add("20");
		al.add("30");
		al.add("10");
		al.add("40");
		
		System.out.println("ArrayList al: "+ al);
		
		
	 ArrayList pl = new ArrayList();
	 
	 pl.add("Hello");
	 pl.add("How");
	 pl.add("Are");
	 pl.add("You");
	 pl.add("?");
		
		
	 System.out.println("ArrayList pl: "+ pl);
		
	 System.out.println("Combining ArrayList al and pl: "+ al.addAll(pl));
	 System.out.println("After Combining ArrayList al and pl arraylist al is: "+ al);
	 System.out.println("After Combining ArrayList al and pl arraylist pl is: "+ pl);
		
	 //removeAll(Collection C)
	 
	 System.out.println("Removing ArrayList al from pl: "+ al.removeAll(pl));
	 System.out.println("After removing ArrayList al from pl arraylist al is: "+ al);
	 System.out.println("After removing ArrayList al from pl arraylist pl is: "+ pl);
	}

}
