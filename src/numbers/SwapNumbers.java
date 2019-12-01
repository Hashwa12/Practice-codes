package numbers;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		System.out.println("Enter the numbers to swap");
		Scanner in = new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		
//		Using TEMP VARIABLE
//		int temp;
//		
//		temp=n1;
//		n1=n2;
//		n2=temp;
//		System.out.println(n1+"     "+n2);
		
//		WITHOUT USING THIRD VARIABLE
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println(n1+"       "+n2);
	}

}
