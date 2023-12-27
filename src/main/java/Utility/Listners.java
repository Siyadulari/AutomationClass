package Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BaseCLASS.baseclass;

public class Listners  extends baseclass implements ITestListener {
	

	public Listners() throws IOException {
		super();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test has been Started:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test has been Pass:"+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test has been Failed:"+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test has been Skipped:"+result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution Started:");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution Finished:");

	}
	

}
