package java_collections;

import java.util.Arrays;
import java.util.HashSet;

public class MissingAlphabets {

	public static void main(String[] args) {
		
		String str = "abcd";
		
		str=str.replaceAll(" ", "");
		
		str=str.toLowerCase();

		System.out.println("asihdviasndvasndvasndvasndvias");
		String arr[] = str.split("");
				
		String alp[]="abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(arr));
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(alp));
		
		set2.removeAll(set1);
		
		System.out.println(set2);
		
	}

}
