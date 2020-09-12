package java_collections;

import java.util.HashMap;

public class CountUsingHashMap {

	public static void main(String[] args) {
		String str = "boo";
//		String []arr = str.split(" ");
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(map.containsKey(arr[i]))
//			{
//				int count = map.get(arr[i]);
//				map.put(arr[i], count+1);
//			}
//			else {
//				map.put(arr[i], 1);
//			}
//		}
//		System.out.println(map);
		
		count(str);
		
	}
	
	static void count(String arg) {
		int count [] = new int[256];
		
		int len = arg.length();
		
		for (int i = 0; i < len; i++) {
			count[arg.charAt(i)]++;
		}
		
		char array[]=new char[len];
		
		for (int i = 0; i < len; i++) {
			array[i]=arg.charAt(i);
			int flag = 0;
			
			for (int j = 0; j <= i; j++) {
				if (arg.charAt(i)==array[j]) {
					flag++;
				}
			}
			
			if(flag==1)
			{
				System.out.println(arg.charAt(i)+"   :   "+count[arg.charAt(i)]);
			}
		}
	}

}
