package oops;

public class ChildOne extends ParentClass{
	
	String role;
	int id1;
	int bonus;
	public ChildOne(int s, int i, String n,String r,int b) {
		super(s, i, n);
		id1 = i;
		role = r;
		bonus = b;
	}

	@Override
	public void salary() {
//		super.salary();
		System.out.println("ChildOne salary method");
	}
	
	public void details() {
		System.out.println("Name of the employee :"+name);
		System.out.println("Salary of the employee :"+salary);
		System.out.println("ID of the employee :"+id1);
		System.out.println("Role of the employee :"+role);
		System.out.println("Bonus for the employee :"+bonus);
	}
	
	
	
}
