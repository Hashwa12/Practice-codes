package all_concepts;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int a,b,y=0;
		System.out.println("Enter the number :  ");
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		b=a/2;
		if(a==0||a==1)
		{
			System.out.println("The entered value is not a prime number");
		}
		else {
			for(int i=2;i<=b;i++)
			{
				if(a%i==0)
				{
					y=1;
					System.out.println("Entered value is not prime");
					break;
				}
			}
		}
		if(y==0)
		{
			System.out.println("entered value is prime");
		}
	}

}
