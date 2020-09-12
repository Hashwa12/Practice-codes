package strings;

import java.util.HashMap;

public class SecondMostFrequent {

	public static void main(String[] args) {
		String str = "My name is Hashwa, my father is Rajendran, I like Anime";
		str = str.toLowerCase();
		String[] s = str.split(" ");

		int first = 0, second = 0;
		String firstChar = null, secondChar = null;

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s1 : s) {
			if (map.containsKey(s1)) {
				map.put(s1, map.get(s1) + 1);
			} else {
				map.put(s1, 1);
			}
		}
		System.out.println(map);
		for (String s2 : map.keySet()) {
			if (map.get(s2) > first) {
				second = first;
				secondChar = firstChar;
				first = map.get(s2);
				firstChar = s2;
			}
			else if(map.get(s2)>second&&map.get(s2)<first)
			{
				second = map.get(s2);
				secondChar =s2;
			}
		}
		System.out.println(secondChar);
	}

}
