package strings;

import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD
import java.util.List;
import java.util.Map.Entry;

public class CountCharacters {

	public static void main(String[] args) {
		String str = "aaabbcc";

		str = str.toLowerCase();

		char ch[] = str.replace(" ", "").toCharArray();
//		String ch[] = str.split(" ");
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

//		for (String c : ch)
		for(char c: ch)
=======

public class CountCharacters {

	public static void main(String[] args) 
	{
		String str="india in the asia in the earth in the solar in the galexy in the universe";
		
		str=str.toLowerCase();
		
		String[] ch=str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String c: ch)
>>>>>>> 188cb2c4f924dcaba0fd40f15e8b520e8566bd10
		{
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
<<<<<<< HEAD
		}
		System.out.println(map);
		int first=0,second=0,temp;
		List<Integer> in = new ArrayList<Integer>();
//		for (Entry<String, Integer> s : map.entrySet()) {
			for (Entry<Character, Integer> s : map.entrySet()) {
					in.add(s.getValue());
			if(s.getValue()>first)
			{
				second=first;
				first=s.getValue();
			}else if(s.getValue()>second)
			{
				temp=second;
				second=s.getValue();
			}
		}
		System.out.println(first);
		System.out.println(second);
		System.out.println(in);
		
=======
		}			System.out.println(map);
	
>>>>>>> 188cb2c4f924dcaba0fd40f15e8b520e8566bd10
	}
}
