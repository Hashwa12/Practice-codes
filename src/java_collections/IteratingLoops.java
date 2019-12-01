package java_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingLoops {

	public static void main(String[] args) 
	{
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Harry");
		ar1.add("Ron");
		ar1.add("Nevil");
		ar1.add("Snape");
		ar1.add("Albus");
		
//		1. using for each loop
		System.out.println("_______using for each loop_________________");
		
		ar1.forEach(name ->{System.out.println(name);});
		
//		2. Using Iterator
		System.out.println("_______using Iterator_________________");
		
		Iterator<String> itr = ar1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		3. Using ListIterator
		System.out.println("_______using List Iterator_________________");
		ListIterator<String> ListItr = ar1.listIterator(ar1.size());
		
		while(ListItr.hasPrevious())
		{
			System.out.println(ListItr.previous());
		}
		
//		4. Using iterator and for each remaining and lambda
		System.out.println("_______Using iterator and for each remaining and lambda_________________");
		itr = ar1.iterator();
		itr.forEachRemaining(name ->{System.out.println(name);});
		
//		5. Using simple for loop
		System.out.println("_______Using simple for loop_______________________");
		
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		
//		6. Using for each loop
		System.out.println("________Using for each loop____________");
		
		for(String s : ar1)
		{
			System.out.println(s);
		}
		
	}
}
