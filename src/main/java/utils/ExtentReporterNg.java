

package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNg {

static ExtentReports extent;
	
	
	
	 public static ExtentReports getReporter(){
		
		 String path =System.getProperty("user.dir")+"\\reports\\index.html";

		 ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		 reporter.config().setReportName("Automation Report");

		 reporter.config().setDocumentTitle("Test Results");

		 extent =new ExtentReports();

		 extent.attachReporter(reporter);

		 extent.setSystemInfo("Tester", "Hargun");
         return extent;
		 }
	}

