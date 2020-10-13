package Second;



import org.testng.Assert;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//@Listeners(CustomListner.class)
public class Tests extends Base{
	
	


	@Test
	  public void m1() {	
		
		
		 intialization();
		 //Assert.fail(); 
	  }
	@Test
	public void m2() {
		System.out.println("Test m2");
		
	}
	
	@Test
	public void m3(ITestResult result) {
		System.out.println("Third");
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			
		}
		else if(result.getStatus()==ITestResult.FAILURE){
			
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			
		}
		
	}
	@AfterSuite
	public void teardown() {
		 	
		driver.close();
	}
	
}
