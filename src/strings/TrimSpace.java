package strings;

import java.util.Scanner;

public class TrimSpace {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string to reverse:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(str.trim());
	}

}
