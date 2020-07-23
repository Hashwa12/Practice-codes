package interviewPrograms;

import java.util.Scanner;

public class Preparation {

	public static void main(String[] args) {
		
//		  Fibonacci series 
//		  int a=0,b=0,c=1; for (int i = 0; i < 5; i++) { a=b; b=c;
//		  c=a+b; System.out.println(c); }
		  
//		  prime number 
//		  int n = 1, n1 = 50, count;
//		  for (int i = n; i <= n1; i++) 
//		  {
//			  count = 0;
//			  for (int j = 2; j < i; j++) 
//			  {
//				  if(i % j == 0) 
//				  {
//					  count++; 
//					  break;
//					  }
//				  }
//			  if(count == 0)
//			  {
//				  System.out.println(i);
//				  }
//		  }
		 

//		Palindrome program
//		System.out.println("Enter the value to be checked...");
//		String str =new Scanner(System.in).next(),rev="";
//		for (int i = str.length()-1; i >= 0; i--) {
//			rev = rev+str.charAt(i);
//		}
//		if (rev.equals(str)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Palindrome");
//		}
//		
//		**************check with recursive method
//		
//		System.out.println(rev(str));
//		}
//	public static String rev(String s) {
//		if(s==null||s.isEmpty())
//			return s;
//		return s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
//		*************Using stringbuilder
//		char[] ch = str.toCharArray();
//		StringBuilder sb = new StringBuilder(str.length());
//		System.out.println(sb.append(ch));

//		right angled triangle
//		int height = 5;
//		for (int i = 0; i < height; i++) {
//			for (int j = height; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
	}

}
