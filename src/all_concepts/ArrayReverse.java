package all_concepts;

import java.util.Arrays;
import java.util.List;

public class ArrayReverse {

	public static void main(String[] args) {

		String str = "Enter the string";
		String[] arr = str.split(" ");
		String rev = "";
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		System.out.println(rev);

	}

}
