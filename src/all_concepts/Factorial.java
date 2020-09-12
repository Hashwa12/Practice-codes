package all_concepts;

public class Factorial {

	public static void main(String[] args) {
		
		int result = 5;
		int num =1;
		while(result!=0)
		{
			num = result*num;
			result--;
		}
		System.out.println(num);
	}

}
