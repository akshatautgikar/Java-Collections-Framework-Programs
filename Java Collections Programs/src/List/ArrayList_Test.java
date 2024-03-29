/* size(), trimToSize(), reversed(), set(i,Object), subList(from index,to index), toArray()
 * 
 */
package List;

import java.util.ArrayList;

public class ArrayList_Test {


	public static void main(String[] args) {
		
	
		ArrayList al = new ArrayList();
		
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('E');
	    al.add(100);
		
		System.out.println("Original ArrayList al is: "+ al);
		
		System.out.println("Finding size of ArrayList al: "+ al.size());
		
		 al.trimToSize();
		 
		 System.out.println("Reverse the ArrayList al: "+ al.reversed());
		 
		 al.set(3, 'Z'); // replaces the Object on specified index with the specified Object given in command
		 
		 System.out.println("After set(i,Object) ArrayList al: "+ al);
		 
		 System.out.println("Creating sublist of ArayList al from index 1 to 3: " + al.subList(1, 4));
		 
		 Object[] abc = al.toArray();
		 
		 
		 for(int i=0;i<abc.length;i++) {
			 
			 System.out.println(abc[i]);
		 }
		 
		 System.out.println("Converted Object array abc is: " + abc);

	}

}
