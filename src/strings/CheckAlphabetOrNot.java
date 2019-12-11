package strings;

import java.util.Scanner;

public class CheckAlphabetOrNot {

	public static void main(String[] args) 
	{
		System.out.println("Enter a character: ");
		Scanner in = new Scanner(System.in);
		char ch= in.next().charAt(0);
		
		if((ch>='a' &&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Entered is a character");
		}
		else if (ch>='0'&&ch<='9') {
			System.out.println("Entered is number");
		}
		else {
			System.out.println("Entered is special character");
		}
		
//		if(Character.isAlphabetic(ch))
//		{
//			System.out.println("Entered is alphabet");
//		}
//		else if (Character.isDigit(ch)) {
//			System.out.println("Entered is number");
//		}
//		else {
//			System.out.println("Entered is special character");
//		}
	}

}
