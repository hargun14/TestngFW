package customlistners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import components.BaseClass;
import components.Component;
import utils.ExtentReporterNg;

public class Listeners extends BaseClass implements ITestListener {

	 ExtentReports extent= ExtentReporterNg.getReporter();
	
	
	public void onTestStart(ITestResult result) {
		
	
		ExtentTest test=extent.createTest(result.getMethod().getMethodName());		 
	    String testname=result.getMethod().getMethodName();
		System.out.println("Testcase execution started" + "   " +testname);
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
	   Component.captureScreenshot(driver);
		String testname=result.getMethod().getMethodName();
	    System.out.println("Test case passed" + "    "  +testname);
		
	
	}
	
	

	public void onTestFailure(ITestResult result) {
		
	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
