package all_concepts;

import java.util.Scanner;

public class Trim {

	public static void main(String[] args)
	{
		System.out.println("Enter the string: ");
		Scanner in= new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(str);
//		System.out.println("Trimmed string is: \n"+str.trim());
		
		String regex = "^\\s*";
		String trimmed = str.replaceAll(regex, "");
		System.out.println(trimmed);
		
		int len = trimmed.length();
		System.out.println(len);
		for(;len>0;len--)
		{
			if(!Character.isWhitespace(trimmed.charAt(len-1)))
				break;
		}
		System.out.println(trimmed.substring(0,len));
		
	}

}
