package strings;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) 
	{
		System.out.println("Enter string");
		Scanner in =new Scanner(System.in);
//		String str = in.nextLine();
		String str="india in the asia in the earth in the solar in the galexy in the universe";
		
		str=str.toLowerCase();
		
//		char ch[] = str.toCharArray();
		String ch[]=str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(String c: ch)
//		for(char c: ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}			System.out.println(map);

		
	}

}
