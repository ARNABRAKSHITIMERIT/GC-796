package UTILITIES;

import java.io.File;
import java.sql.Date;
import java.sql.Timestamp;
import org.testng.ITestResult ;
import org.testng.ITestContext ;
import org.testng.ITestListener ;
import java.text.SimpleDateFormat;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.ExtentTest ;
import com.aventstack.extentreports.ExtentReports ;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.configuration.Theme ;
import com.aventstack.extentreports.reporter.ExtentSparkReporter ;

public class Extent_Report implements ITestListener {
ExtentSparkReporter htmlReporter ;
ExtentReports reports ;	
ExtentTest test ;	
	
public void configureReport () {
Read_Config read_config = new Read_Config();	
String reportname = "GC UI Automation Test Report.html" ;
htmlReporter = new 	ExtentSparkReporter(System.getProperty("user.dir") + "//REPORTS//" + reportname) ;
reports = new ExtentReports () ;
reports.attachReporter(htmlReporter) ;	
reports.setSystemInfo("Machine : " , "Arnab Rakshit Laptop" ) ;	
reports.setSystemInfo("Operating System : " , "Windows 10") ;
reports.setSystemInfo("Browser :" , read_config.Get_Browser()) ;
reports.setSystemInfo("User Name :" , "Arnab Rakshit") ;
htmlReporter.config().setDocumentTitle("Extent Report Itest_Listener") ;
htmlReporter.config().setReportName("Extent Report of Ground Control UI Automation") ;
htmlReporter.config().setTheme(Theme.DARK) ;
htmlReporter.config().setTimeStampFormat("EEEE , MMMM dd , yyyyy , hh:mm a '('zzz')' "); }
	
public void onStart (ITestContext Result) {
configureReport();
System.out.println("On Start Method Invoked ....") ; }
	
public void onFinish (ITestContext Result)	 {
System.out.println("On Finish Method Invoked ....") ;
reports.flush() ; }
	
public void onTestFailure (ITestResult Result) {	
System.out.println("Name of Test Method Failed : " + Result.getName()) ;
test = reports.createTest(Result.getName()) ;	
test.log(Status.FAIL , MarkupHelper.createLabel("Name of the Failed Test Case is : " + Result.getName() , ExtentColor.RED)) ; }
	
public void onTestSkipped (ITestResult Result ) {	
System.out.println("Name of Test Method Skipped : " + Result.getName());
test = reports.createTest(Result.getName());	
test.log(Status.SKIP , MarkupHelper.createLabel("Name of the Skipped Test Case is : " + Result.getName() , ExtentColor.YELLOW)) ; }	

public void onTestStart (ITestResult Result ) {	
System.out.println("Name of Test Method Started : " + Result.getName()) ; }

public void onTestSuccess (ITestResult Result ) {	
System.out.println("Name of Test Method Successfully Executed : " + Result.getName());
test = reports.createTest(Result.getName());	
test.log(Status.PASS , MarkupHelper.createLabel("Name of the Passed Test Case is : " + Result.getName() , ExtentColor.GREEN)) ; }	

public void onTestFailedButWithinSuccessPercentage (ITestResult Result ) {	}}
