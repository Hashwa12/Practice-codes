package java_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListsConcept {

	public static void main(String[] args) 
	{
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("Name1");
		ar1.add("Name2");
		ar1.add("Name3");
		ar1.add("Name4");
		
		System.out.println(ar1.size());
		
		for (String string : ar1) {
			System.out.println(string);
		}
		
		Iterator<String> itr1 = ar1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
		System.out.println("**************");
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("dep1");
		ar2.add("dep2");
		ar2.add("dep3");
		ar2.add("dep4");
		
		ar1.addAll(ar2);//add ar2 to ar1
//		ar1.removeAll(ar2)  remove ar2 values from ar1
//		ar1.retainAll(ar2)    retain the common in ar1 and ar2
		
		
		Iterator<String> itr2 = ar1.iterator();
		while (itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

}
