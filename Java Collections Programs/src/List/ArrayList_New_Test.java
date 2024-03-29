/* Program to understand the working of arraylist methods- removeAll(), retainAll()
 */
package List;

import java.util.ArrayList;

public class ArrayList_New_Test {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(33);
		al.add(40);
		al.add(90);
		al.add(180);
		
		
		System.out.println("The contents of arraylist al are: " + al);
		
        ArrayList<Integer> dl = new ArrayList<Integer>();
		
		dl.add(100);
		dl.add(33);
		dl.add(400);
		dl.add(900);
		dl.add(180);
		
		System.out.println("The contents of arraylist dl are: " + dl);
		
        al.retainAll(dl);
		
		System.out.println("The contents of arraylist al after retainAll() are: " + al);
		System.out.println("The contents of arraylist dl after retainAll() are: " + dl);
		
		//al.removeAll(dl);
		
		//System.out.println("The contents of arraylist al after removeAll() are: " + al);
		//System.out.println("The contents of arraylist dl after removeAll() are: " + dl);
		
		//al.removeIf(n -> (n%2 ==0));
		//System.out.println("The contents of arraylist al after removeIF() are: " + al);
		
		

	}

}
