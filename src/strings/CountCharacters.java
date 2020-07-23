package strings;

import java.util.HashMap;

public class CountCharacters {

	public static void main(String[] args) 
	{
		String str="india in the asia in the earth in the solar in the galexy in the universe";
		
		str=str.toLowerCase();
		
		String[] ch=str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String c: ch)
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
