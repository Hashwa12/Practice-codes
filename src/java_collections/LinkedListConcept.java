package java_collections;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Name");
		ll.add("Dept");
		ll.add("Salery");
		ll.add("Experience");
		
		System.out.println(ll);
		
		ll.addFirst("Roll Number");
		ll.addLast("Joining Date");
		
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
	}
}
