package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success Results are  "+result.getName()+"ON_TEST_SUCCESS");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure results are  "+result.getName()+"ON_TEST_FAILURE");		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("Skipped results are  "+result.getName()+"ON_TEST_SKIPPED");	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
