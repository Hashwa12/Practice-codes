package all_concepts;

import java.util.HashMap;

public class InterviewQuestions {

	public static void main(String[] args) 
	{
		String str = "my name is hashwanth.";

		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
		if(Character.isAlphabetic(ch[i]))
			System.out.print(ch[i]);
	}
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(map.containsKey(ch[i]))
			{
				int count = map.get(ch[i]);
				map.put(ch[i], count+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
	System.out.println(map);
	
	
	
	}

}
