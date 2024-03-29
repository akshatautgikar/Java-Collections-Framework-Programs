/* Java Program to understand the methods - replaceAll()
 */
package List;

import java.util.ArrayList;

public class ArrayList_replace_Test {

	
	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("java");
		al.add("c programming");
		al.add("python");
		al.add("dotnet");
		al.add("php");
		
		
		System.out.println("The contents of arraylist al are: " + al);
		
		al.replaceAll(n ->(n.toUpperCase()));
		
		System.out.println("The contents of arraylist al after replaceAll() are: " + al);
		
        ArrayList<Double> price = new ArrayList<Double>();
		
        price.add(2000.00);
        price.add(996.99);
        price.add(5000.99);
        price.add(12560.99);
        price.add(8999.99);
		
		
		System.out.println("The contents of arraylist price are: " + price);
		
		price.replaceAll(n ->(n*0.5));
		
		System.out.println("The contents of arraylist price after replaceAll() are: " + price);
		
	

	}

}
