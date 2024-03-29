/* Different Methods of ArrayList
 */  

// I can make my arraylist typesafe - i can make my arraylist to work as array

package List;

import java.util.ArrayList;

public class Test_ArrayList_AddMethods {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); //ArrayList is not typesafe 
		
		al.add(true);
		al.add(-97);
		al.add(56.33f);
		al.add('s');
		al.add(100);
		al.add("evening");
		
		System.out.println("The Objects inside arraylist al are: " + al);
		
		al.add(0, "Hello");
		
		System.out.println("The Objects inside arraylist al after adding String Hello at index 0 are: " + al);
		
		ArrayList msg = new ArrayList();
		
		msg.add(100);
		msg.add(200);
		msg.add(300);
		msg.add(400);
		msg.add(500);

		System.out.println("The Objects inside arraylist msg are: " + msg);
		
		//al.addAll(msg);
		
		al.addAll(3, msg);
		
		//System.out.println("The changes in arraylist al after adding collection msg: " + al);
		System.out.println("The changes in arraylist msg after adding collection msg in al: " + msg);
		
		System.out.println("The changes in arraylist al after adding collection msg to index 3: " + al);
		
		msg.addFirst(null);
		
		msg.addLast("End of msg ArrayList");
		
		System.out.println("The changes in arraylist msg after addfirst and addlast methods: " + msg);
		
		
	}

}
