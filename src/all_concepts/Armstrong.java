package all_concepts;

public class Armstrong {

	public static void main(String[] args) 
	{
//		int n=153,c=0,a,temp;
//		temp=n;
//		while(n>0)
//		{
//			a=n%10;
//			n=n/10;
//			c=c+(a*a*a);
//		}
//		if(temp==c)
//		{
//			System.out.println("Entered is armstrong");
//		}
//		else {
//			System.out.println("Entered is not armstrong");
//		}
		
		int number = 1634, originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10)
        	++n;
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    
		
	}

}
