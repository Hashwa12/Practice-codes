package all_concepts;

import java.util.Arrays;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class LargestNumber {

	public static void main(String[] args) 
	{
        int arr[] = { 14, 99, 47, 99, 86, 36, 89 };
        int a=arr[0],b=arr[0],c=arr[0];
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			a=arr[i];
        			arr[i]=arr[j];
        			arr[j]=a;
        		}
        	}
        	if(arr[i]>a)
        	{
        		b=a;
        		a=arr[i];
        	}
        	else if (arr[i]>b)
        	{
        		c=b;
        		b=arr[i];
        		
        		if(a==b)
        		{
        			b=c;
        		}
			}
        }
//        Arrays.sort(arr);
//	System.out.println(arr[arr.length-1]);
        System.out.println("Largest number is :"+ a+"Second is :" +b);
	}

}
