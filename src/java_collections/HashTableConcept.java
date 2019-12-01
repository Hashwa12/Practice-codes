package java_collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args)
	{
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		
		h1.put(1, "Tom");
		h1.put(2, "Doing");
		h1.put(3, "Testing");
		
		System.out.println(h1);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2=(Hashtable<Integer, String>)h1.clone();
		System.out.println("Values from h1 are   "+ h1);
		System.out.println("Values from h2 are   "+ h2);
		
		Hashtable has = new Hashtable();
		has.put("A", "I");
		has.put("B", "Love");
		has.put("C", "India");
		
//Using enumeration to print all the values 		
		
		Enumeration e = has.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());	
		}
		
		Set s = has.entrySet();
		System.out.println(s);
		
		Hashtable has1 = new Hashtable();
		has1=(Hashtable) has.clone();
		
		if(has.equals(has1))
		{
			System.out.println("Both are equals");
		}
		
	}
}
