package all_concepts;

public class FirstClassTest {

	public static void main(String[] args) 
	{
		String name[] = {"arun","bala","vasi","raji","diya"};
		String empno[] = {"1","2","3","4","5"};
		char salary[] = {21000,31000,30000,65000,51000};
		String[] designation= {"accounts","supervisor","accounts","manager","TL"};
		
		for(int i=0;i<5;i++)
		{
			if(salary[i]>50000)
			{
				System.out.println(name[i]+empno[i]+designation[i]);
			}
			if(designation[i]=="accounts"||designation[i]=="supervisor")
			{
				if(salary[i]>30000)
				{
					System.out.println(name[i]+empno[i]+designation[i]);
				}
			}
		}
	}

}
