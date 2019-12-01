package numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		boolean flag = true;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Entered number is prime");
		}
		else {
			System.out.println("Entered number is not prime");
		}
		
	}

}
