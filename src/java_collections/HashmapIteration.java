package java_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapIteration {

	public static void main(String[] args) {

	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	map.put(1, "Aravind");
	map.put(2, "Bala");
	map.put(3, "Charu");
	map.put(4, "Dhivya");
	
	Iterator itr = map.entrySet().iterator();
	while (itr.hasNext()) {
		Map.Entry me = (Map.Entry)itr.next();
		System.out.println(me.getKey()+" \t"+me.getValue());
	}
	
	for(Map.Entry me2 : map.entrySet())
	{
		System.out.println(me2.getKey()+"\t\t"+me2.getValue());
	}
	}

}
