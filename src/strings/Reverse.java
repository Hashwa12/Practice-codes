package strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string to reverse:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		String reverse = "";
		String [] arr = str.split(" ");
		
//		for(int i=0;i<arr.length;i++)
//		{
//			StringBuilder sb = new StringBuilder(arr[i]);
//			reverse+=sb.reverse()+" ";
//		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			reverse = "";
			String temp = arr[i];
			for(int j=temp.length()-1;j>=0;j--)
			{
				reverse+=temp.charAt(j);
			}
			System.out.print(reverse+"\t");
		}
	}

}
