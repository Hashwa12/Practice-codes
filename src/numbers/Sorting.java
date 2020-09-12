package numbers;

public class Sorting {
	public static void main(String[] a) {
		
		int[] a1 = {100,12,5,4,11};
		int first = 0,second=0,temp;
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i]>a1[j])
				{
					first = a1[i];
					a1[i]=a1[j];
					a1[j]=first;
				}
			}
			System.out.println(a1[i]);
		}
		
	}
}
