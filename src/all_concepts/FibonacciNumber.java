package all_concepts;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number upto which fibanocci series to be printed : ");
		int num, a=0,b=0,c=1;
		Scanner in= new Scanner(System.in);
		num=in.nextInt();
		for(int i=0;i<num;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
	}
}
