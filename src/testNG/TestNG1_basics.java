package testNG;

import org.testng.annotations.Test;

public class TestNG1_basics
{
	@Test
	public void addition()
	{
		int a=5,b=10;
		int c=a+b;
		System.out.println("Addition of Two numebrs are ="+c);
	}
}
