package all_concepts;
import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		int a,b,temp;
		System.out.println("Enter the values");
		Scanner c = new Scanner(System.in);
		a=c.nextInt();
		b=c.nextInt();
		System.out.println("Values before swaping"+a+"   "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Values after swaping"+a+"   "+b);
	}

}
