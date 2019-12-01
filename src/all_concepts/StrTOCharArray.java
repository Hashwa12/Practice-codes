package all_concepts;

import java.util.Scanner;

public class StrTOCharArray {

	public static void main(String[] args)
	{
		System.out.println("enter the string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char ch[]=str.toCharArray();
		int i = str.length();
		for(int j=0; j<i;j++)
		{
			System.out.println(ch[j]);
		}
	}

}
