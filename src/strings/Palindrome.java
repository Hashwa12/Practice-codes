package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String temp = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			temp+=str.charAt(i);
		}
		System.out.println(temp);
		if(temp.equals(str))
		System.out.println("Palindrome");
		else {
			System.out.println("Not palindrome");
		}
	}

}
