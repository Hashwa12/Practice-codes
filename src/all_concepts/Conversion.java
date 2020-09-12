package all_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Conversion {

	public static void main(String[] args)
	{
		int count=0;
		String str = "Welcome to the world";
		String[] s1 = str.split(" ");
//		Array to list
		List<String> list = new ArrayList<String>(Arrays.asList(s1));
		System.out.println(list);
//		List to Array
		String[] l2a = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(l2a));
//
		
	}

}
