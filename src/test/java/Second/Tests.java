package Second;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//@Listeners(CustomListner.class)
public class Tests extends Base{
	
public ExtentReports extent;
public ExtentTest  Extenttest;

@BeforeTest
public void setExtent() {
	extent = new ExtentReports("C:\\Users\\salahari\\eclipse-workspace\\SunilTest\\test-output\\Extent.html", true);
	extent.addSystemInfo("Host Name" ,"SunilAlahari");
	
			
}
public void ExetentClose() {
	extent.flush();
	extent.close();
}

@BeforeMethod
public void setup() {

	intialization();

}
	@Test
	  public void AlahariTest() {	
		
		Extenttest = extent.startTest("AlahariTest");
		Extenttest.log(LogStatus.PASS, "HI I am Passed!");
		
		
		Assert.assertEquals("Google", driver.getTitle());	
		
		
 
	  }
	@Test
	public void TestSunil1() throws InterruptedException {
		Thread.sleep(10000);
		Extenttest = extent.startTest("TestSunil1");
		driver.findElement(By.name("q")).sendKeys("Om Nama S"
				+ "hovaya:");
		Thread.sleep(5000);
		
		
	}
	 
	@Test
	public void m3() {
		System.out.println("Third");
		Extenttest = extent.startTest("m2");
		
		
		/*if(result.getStatus()==ITestResult.SUCCESS)
		{
			
		}
		else if(result.getStatus()==ITestResult.FAILURE){
			
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			
		}
		*/
		
	}
	@AfterMethod
	public void Teardown(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.SUCCESS) {
			String s =takescreenhostPass(result.getName());
			Extenttest.log(LogStatus.PASS, "testCaseFailed "+result.getName());
			Extenttest.log(LogStatus.PASS, Extenttest.addScreencast(s));
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			String s=takescreenhostFail(result.getName());
			Extenttest.log(LogStatus.FAIL, "failed");
			Extenttest.log(LogStatus.FAIL, Extenttest.addScreencast(s));
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			takesScreenshotSkip(result.getName());
		}
		driver.close();
		extent.endTest(Extenttest);
	}
	
	
}
