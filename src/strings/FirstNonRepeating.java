package strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

	public static void main(String[] args) 
	{
		String str = "aabcccddddefff";
		
		char ch[]=str.toCharArray();
		int count=1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
		
		for (int i = 0; i < str.length(); i++) {
			char c  = str.charAt(i);
			if(map.get(c)==1)
			{
				System.out.println(c);
				break;
			}
		}
	}

}
