package strings;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		System.out.println("Enter the string to reverse:");
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2= in.nextLine();
		
		str1 = str1+str2;
		System.out.println(str1);
		
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println(str1+"      "+str2);
		
	}

}
