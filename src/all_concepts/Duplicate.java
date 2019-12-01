package all_concepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {

	public void dup(String str) {
		
		 Map<Character, Integer> map = new HashMap<Character, Integer>();
		 
		 char ch[] = str.toCharArray();
		 
		 for (Character c : ch) {
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		 Set<Character> key = map.keySet();
		 for(Character c: key)
		 {
			 if (map.get(c)>1) {
				System.out.println(c+" "+ map.get(c));
			}
		 }
	}
	public static void main(String[] args)
	{
//		String a;
//		System.out.println("Enter the string to find duplicate : ");
//		Scanner in=new Scanner(System.in);
//		a=in.nextLine();
//		String str = new String(a);
//		char ch[]=str.toCharArray();
//		for (int i = 0; i < str.length(); i++)
//		{
//			for (int j = i+1; j < str.length(); j++)
//			{
//				if(ch[i]==ch[j])
//				{
//					System.out.println(ch[j]);
//					
//				}
//			}			
//		}
		Duplicate du = new Duplicate();
		System.out.println("enter the string");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		du.dup(str);
	}

}
