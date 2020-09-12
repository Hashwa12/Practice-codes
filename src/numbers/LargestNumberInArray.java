package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestNumberInArray {

	public static void main(String[] args) {
		System.out.println("Enter the numbers:");
		Scanner in = new Scanner(System.in);
//		Integer []str = new Integer[]{10,20,5,3,15};
//		String str1[]= {"A","D","C"};
//		//list(str);
//		ArrayList<String> li2=new ArrayList<String>(Arrays.asList(str1));
//		Collections.sort(li2);
//		System.out.println(li2);
//		
//		Object []d=li2.toArray(new String[li2.size()]);
//		
//		for(int i=0;i<d.length;i++)
//		{
//			System.out.println(d[i]);
//		}		
//		
//		ListIterator<String> itr = li2.listIterator(li2.size());
//		System.out.println("New values");
//		while(itr.hasPrevious())
//			System.out.println("Values"+itr.previous());
//			}
//	
//	static  void list(Integer[] str) {
//		ArrayList<Integer> li1 = new ArrayList<Integer>(Arrays.asList(str));
//		Collections.sort(li1);
//		System.out.println(li1);
//		
//	Object[] a=li1.toArray(new String[li1.size()]);
//	System.out.println(a);
		int[] num = new int[5];
		for(int i=0;i<5;i++)
		{
			num[i] = in.nextInt();
		}
		List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}

}
