package all_concepts;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		//*******************USING reverse()***************************
		//String a = "hai India";
//		StringBuilder b = new StringBuilder(a);
//		b = b.reverse();
//		System.out.println(b);
		//*****************USING ToCharArray()
//		char b[] = a.toCharArray();
//		for(int i=b.length-1;i>=0;i--)
//		{
//			System.out.print(b[i]);
//		}
		//*******************USING split("")
//		String a;
//		Scanner b = new Scanner(System.in);
//		System.out.println("Enter the string : ");
//		a=b.nextLine();
//		String c[] = a.split("");
//		for(int i=c.length-1;i>=0;i--)
//		{
//			System.out.print(c[i]+"");
//		}
		
//		String Original, reverse ="";
//		System.out.println("Enter the input string : ");
//		@SuppressWarnings("resource")
//		Scanner in = new Scanner(System.in);
//		Original = in.nextLine();
//		for(int i = Original.length()-1;i>=0;i--)
//		{
//			reverse=reverse+Original.charAt(i);
//		}
//		System.out.println(reverse);
		
		String Reverse[];
		String rev;
		System.out.println("Enter the input :");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		int count = 0;
		int len=text.length();
		System.out.println(len);
//		for(int i=0;i<len;i++)
		{
			Reverse = text.split(" ", 2);
			System.out.println(String.format("%s", Reverse));
//			for(int j=count;j>=0;j--)
////			{
////				Reverse = text.charAt(j);
////				System.out.println(Reverse);
////				break;
////			}
//			i=count;
		}
		
	}

}
