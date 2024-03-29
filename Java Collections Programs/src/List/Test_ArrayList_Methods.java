/* ensureCapacity(), equals(), getFirst(), getLast(), hashCode(), indexOf(), isEmpty(), lastIndexOf()
 * 
 */
package List;

import java.util.ArrayList;

public class Test_ArrayList_Methods {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(78.33);
		al.add(65.00);
		al.add(56.89);
		al.add(35.03);
		al.add(45.02);
		
		System.out.println("The contents of ArrayList al are: " + al);
		
		al.ensureCapacity(50);
		
        ArrayList hello = new ArrayList();
		
		hello.add(78.33);
		hello.add(65.00);
		hello.add(-100);
		hello.add(35.03);
		hello.add(45.02);
		
		System.out.println("The contents of ArrayList hello are: " + hello);
		
		System.out.println("The comparision of arraylist al and hello returns: " + al.equals(hello));
		
		
		System.out.println("read the Object at index 4 in arraylist al using get() method: " + al.get(4));
		
		System.out.println("read the first object for arraylist al : " + al.getFirst());
		System.out.println("read the last object for arraylist al : " + al.getLast());
		
		System.out.println("using hashcode() for arraylist al : " + al.hashCode());
		
		
		
		String s = "Good";
		
		System.out.println("using hashcode() for String s: " + s.hashCode());
		
		
        String s1 = "good";
		
		System.out.println("using hashcode() for String s: " + s1.hashCode());
		
		
		
	ArrayList mix = new ArrayList();
		
	mix.add(-900);
	mix.add('d');
	mix.add(89.57);
	mix.add(-900);
	mix.add("hello");
	
	System.out.println("The contents of ArrayList mix are: " + mix);
	System.out.println("find index of objects in ArrayList mix using indexOf(): " + mix.indexOf(-900));
	
	System.out.println("find index of objects in ArrayList mix using indexOf(): " + mix.lastIndexOf(-900));
	
	
	mix.clear();
	
	System.out.println("check if ArrayList mix is empty: " + mix.isEmpty());
	
	
	
	
		}

}
