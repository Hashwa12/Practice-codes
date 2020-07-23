package all_concepts;

public class NumPalindrome {

	public static void main(String[] args) 
	{
		int temp=0,n = 1234,first,fourth;
		temp=n;
		if(n>0)
		{
			fourth = n%10;
			first=n/1000;
			
			n=n%100;
			n=n/10;
			
			
			temp=temp/100;
			temp=temp%10;
			
			System.out.println(first);
			System.out.println(temp);
			System.out.println(n);
			System.out.println(fourth);
			if(first==fourth)
				System.out.println("Number is Paliandrome");
			else {
				System.out.println("Number is Not a Paliandrome");
			}
		}
	}

}
