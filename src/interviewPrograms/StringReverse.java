package interviewPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.beust.jcommander.JCommander.Builder;

public class StringReverse {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		//		****************************Using String Buffer*******************************
		System.out.println("USING STRINGBUFFER");
		String s1[] = str.split(" ");
		StringBuilder SB = null;
		String reverse = "";
		for(int i=0;i<s1.length;i++)
		{
			SB = new StringBuilder(s1[i]);
			reverse+=SB.reverse()+" ";
		}
		System.out.println(reverse);

		//		******************************Using Array and iterator*************************
		System.out.println("USING ARRAY AND LIST ITERATOR");
		char []ch=str.toCharArray();
		List<Character> li = new ArrayList<>();
		for(char c : ch)
		{
			li.add(c);
		}

		Collections.reverse(li);

		@SuppressWarnings("rawtypes")
		ListIterator itr = li.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}

}
