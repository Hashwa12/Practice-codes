package all_concepts;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) 
	{
		int n;
		System.out.println("Please enter the height:");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
//		for(int i=0;i<=n;i++)
//		{
//			for (int j = n; j > i; j--)
//				System.out.print("  ");
//			for(int k=0;k<(2*i-1);k++)
//				System.out.print("* ");
//			System.out.println("");
//		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j >= 1; j--) {
				System.out.print("^");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
