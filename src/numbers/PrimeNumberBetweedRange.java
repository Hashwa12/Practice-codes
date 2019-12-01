package numbers;

import java.util.Scanner;

public class PrimeNumberBetweedRange {

	public static void main(String[] args) 
	{
		System.out.println("Enter the starting number :");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println("Enter the last number :");
		int num2= in.nextInt();
		boolean flag=true;
		int count=0;
		for(int i=num1; i<=num2;i++)
		{
			count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(i+"\t");
			}

		}
		
		
	}

}
