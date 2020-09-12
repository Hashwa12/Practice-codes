package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		System.out.println("Enter the array values: ");
		Scanner in = new Scanner(System.in);
		List<Integer> li = new ArrayList<Integer>();
		
		int temp =0;
		for(int i=0;i<5;i++)
		{
			temp=in.nextInt();
			li.add(temp);
		}
		Collections.sort(li);
		System.out.println(li);
		
		Integer []arr = new Integer[li.size()];
				arr=li.toArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		Set s = new HashSet<>(Arrays.asList(arr));
		li.clear();
		
		li.addAll(s);
		System.out.println(li);
	}

}
