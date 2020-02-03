package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlphanumericAddition {

	public static void main(String[] args) 
	{
		System.out.println("Enter alphanumeric value");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
//		String replace=str.replaceAll("[^0-9]","");
//		System.out.println(replace);
//		
//		char ch[]=replace.toCharArray();
//		int sum=0;
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			sum+=(Character.getNumericValue(ch[i]));
//		}
//		System.out.println(sum);
				
		char ch[]=str.toCharArray();
		int sum=0;
		
		for (int i = 0; i < str.length(); i++) {
			if(	Character.isDigit(ch[i]))
			{
//				System.out.println(ch[i]);
				sum=sum+((int)ch[i]);//(Character.getNumericValue(ch[i]));
//				System.out.println(sum);
			}
		}System.out.println("Sum of numbers is :"+sum);
	}

}
