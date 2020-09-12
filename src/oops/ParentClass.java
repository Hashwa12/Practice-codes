package oops;

public class ParentClass {

	int salary;
	private int id;
	String name;
	
	
	public ParentClass(int s,int i,String n) {
		salary = s;
		id = i;
		name = n;
	}
	
	public void salary()
	{
		System.out.println("Parent Class salary method");
	}
	public static void timing()
	{
		System.out.println("Parent Class timing method");
	}
	
}
