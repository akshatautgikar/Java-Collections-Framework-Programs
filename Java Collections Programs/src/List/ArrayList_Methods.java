/**
 * 
 */
package List;

import java.util.ArrayList;


public class ArrayList_Methods {

	public static void main(String[] args) {
	
		ArrayList<Integer> hello = new ArrayList<Integer>();
		
		
		hello.add(200);
		hello.add(300);
		hello.add(400);
		hello.add(500);
		hello.add(600);
		hello.add(500);
		hello.add(700);
		hello.add(500);
		
		System.out.print("The contents of ArrayList hello are: " + hello);
		
		//for(int i:hello) {
			//System.out.print(i+ "  ");
		//}
		
	     //hello.remove(1); // removes object on specified index
		
		//System.out.println("The contents of ArrayList hello after remove(index) are: " + hello);
		
		//hello.remove(500); // removes specified object on its first occurrence 
		//System.out.println("The contents of ArrayList hello after remove(Object) are: " + hello);
		
		//hello.remove(1000);// removes specified object on its first occurrence, if not found arraylist remains unchanged
		//System.out.println("The contents of ArrayList hello after remove(Object) are: " + hello);
	
		
		
		

	}

}
