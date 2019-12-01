package all_concepts;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		
		System.out.println(" enter string1");
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		
		stringCom(s1);
		index(s1);
	}
	
	public static void index(String sentance) {
		String casing = sentance.toLowerCase();
		int loc = casing.indexOf("selenium");
		
		if(loc>=0)
		{
			System.out.println("FOund");
		}
		else {
			System.out.println("Not found");
		}
	}
		
	public static void stringCom(String s) {
		String c1 = "selenium";
		String low = s.toLowerCase();
		if(low.equals(c1))
		{
			System.out.println("Equals");
		}
		else {
			System.out.println("Not equals");
		}
	}

}
