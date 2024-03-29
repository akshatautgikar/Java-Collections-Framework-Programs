/*clear(), clone(), contains(), containsAll()
 * 
 */
package List;

import java.util.ArrayList;

public class ArrayList_Methods_Practice_clear_clone_contains {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);

		System.out.println("The Objects inside arraylist al are: " + al);
		
		
		ArrayList hello = new ArrayList();
		
		hello.add('a');
		hello.add('b');
		hello.add('c');
		hello.add('d');
		
		
		System.out.println("The contains all before addall collection for arraylist al is: " + al.containsAll(hello));
		
		
		al.addAll(hello);
		
		System.out.println("The contains all after addall collection for arraylist al is: " + al.containsAll(hello));
		
		boolean b = al.contains(300);
		System.out.println("The contains method output for arraylist al is: " + b);
		
		
		System.out.println("The contains method output for arraylist al is: " + al.contains(600));
	
		
	    //	al.clear();
		
		//System.out.println("The arraylist al after clear() is: " + al);
		
		
	     Object duplicate = new ArrayList();
		
		duplicate = al.clone();
		
		System.out.println("The cloned Object duplicate is: " + duplicate);
		
		
		Object copied_arraylist = al.clone();
		
		System.out.println("The cloned Object copied_arraylist is: " + copied_arraylist);
		
		
		
	
	
		
		
	}

}
