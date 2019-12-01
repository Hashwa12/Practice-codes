package all_concepts;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		String original, reverse="";
		int num;
		System.out.println("Enter the text or value : ");
		Scanner a=new Scanner(System.in);
		original=a.nextLine();
		num=original.length();
		for(int i=num-1;i>=0;i--)
		{
			reverse = reverse+original.charAt(i);
		}
		
		if(original.equals(reverse))
		{
			System.out.println("This is palindrom");
		}
		else {
			System.out.println("This is not palindrom");
		}
	}

}
