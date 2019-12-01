package all_concepts;
import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) 
	{
		int year;
		System.out.println("hai");
		for(int i=0;i<5;i++)
			{
			@SuppressWarnings("resource")
			Scanner a = new Scanner(System.in);
			year = a.nextInt();
			//a.close();

				if((year%4==0)&&((year%100!=0)||(year%400==0)))
				{
					System.out.println("This is leap Year");
				}
				else
				{
					System.out.println("This is not a leap year");
			
				}
			}
		
	/*	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int year;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	year = scan.nextInt();
    	scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");*/
   	}

}
