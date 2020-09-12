package numbers;

public class Factorial {
	int a;
	Integer x;

	void Answer(int num)
	{
		int fact = 1;
		
		for (int i = 1; i <=num; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
	void dis() {
		System.out.println(a+"  "+x);
	}
	Factorial(int len)
	{
		Answer(len);
	}
	
	Factorial(int a1,Integer x1)
	{
		a=a1;
		x=x1;
	}
	

	public static void main(String[] args) 
	{
		int a;
		Factorial f1 = new Factorial(5, 1000);
		f1.dis();
		Factorial f2= new Factorial(5);
		f2.Answer(4);
	}
	

}
