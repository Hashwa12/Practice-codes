package oops;

public class ChildTwo extends ChildOne {

	String role;
	String name;
	int salary;
	int id2;
	int bonus;

	public ChildTwo(int s, int i, String n, String r, int b) {
		super(s, i, n, r, b);
		role = r;
		bonus = b;
	}

	@Override
	public void salary() {
//		super.salary();
		System.out.println("ChildTwo salary method");
	}
}
