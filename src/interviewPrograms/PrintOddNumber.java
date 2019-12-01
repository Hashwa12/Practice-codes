package interviewPrograms;

import java.util.Scanner;

public class PrintOddNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter the starting number:  ");
		Scanner in = new Scanner(System.in);
		int firstnumber = in.nextInt();
		
		System.out.println("Enter the ending number:  ");
		int lastnumber = in.nextInt();
		
		for (int i = firstnumber; i <=lastnumber; i++) {
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}

}
