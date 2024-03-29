package List_LinkedList;

import java.util.*;

public class Compare_AL_LL {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(10);
		al.add(10);
		
		System.out.println("ArrayList: "+ al);
		
       LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(10);
		ll.add(30);
		
		System.out.println("LinkedList: "+ ll);
		
		boolean b = al.containsAll(ll);
		
		System.out.println("LinkedList vs ArrayList: "+ b);
		
	}

}
