package interviewPrograms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array: ");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int str[] = new int[size];
		
		System.out.println("Enter the numbers in array");
		for(int i=0;i<size;i++)
		{
			str[i]=in.nextInt();
		}
		
		bubble(str);
		for(int x:str)
			System.out.println(x);
		

	}
	
	static void bubble(int arr[]) 
	{
		int len = arr.length;
		int temp=0;
		
		for(int i=0;i<len;i++)
		{
			for (int j = 1; j < (len-i); j++) {
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
