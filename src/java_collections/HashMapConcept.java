package java_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args)
	{
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		
//		hm.put(1, "Name");
//		hm.put(2, "Dept");
//		hm.put(3, "Salary");
//		hm.put(4, "Experience");
//		
//		System.out.println(hm.get(2));
//		
//		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
//		
//		Employee e1 = new Employee("Tom", 25, "Admin");
//		Employee e2 = new Employee("Jerry", 20, "Dev");
//		Employee e3 = new Employee("Pluto", 35, "Support");
//		Employee e4 = new Employee("Olive", 26, "HR");
//		
//		emp.put(1, e1);
//		emp.put(2, e2);
//		emp.put(3, e3);
//		emp.put(4, e4);
//		
//		
//		for(Entry<Integer, Employee> m: emp.entrySet())
//		{
//			int key = m.getKey();
//			Employee e=m.getValue();
//			System.out.println(key+"    "+e.name+"    "+e.age+"  "+e.dept);
//		}		
//		System.out.println(e1.age);

//	**************************************************************************************************
		String Customer_Credentials = getCredentialsMap().get("Customer");
		System.out.println(Customer_Credentials.split(":")[0]);
		System.out.println(Customer_Credentials.split(":")[1]);
		
	}
	public static HashMap<String, String> getCredentialsMap() {
		HashMap<String, String> usermap = new HashMap<String,String>();
		usermap.put("Customer", "aravind:aravind@123");
		usermap.put("admin", "bala:bala@123");
		usermap.put("distributor", "chandran:chandran@123");
		usermap.put("seller", "dhivya:dhivya@123");
		usermap.put("delivery", "Ezhil:Ezhil@123");
		return usermap;
	}
}
