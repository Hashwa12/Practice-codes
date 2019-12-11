package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicatesCount {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		List<String> li = Arrays.asList(str.split(" "));
		
		Set<String> s = new HashSet<String>(li);
		
		for(String c: s)
		{
			System.out.println(c+":  "+Collections.frequency(li, c));
		}
		
	}

}
