package all_concepts;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args)
	{
		System.out.println("Entet the string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] ch=str.toCharArray();
		String rep = null;
		System.out.println(ch);
		rep=str.replace("do", "don't");
		System.out.println(str.toCharArray()[0]);
		System.out.println(rep);
	}

}
