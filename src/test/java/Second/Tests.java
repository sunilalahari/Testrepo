package Second;

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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//@Listeners(CustomListner.class)
public class Tests extends Base{

@BeforeMethod
public void setup() {

	intialization();

}
	@Test
	  public void m1() {	
		
		Assert.assertEquals("Google", driver.getTitle());	
		
 
	  }
	@Test
	public void m2() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.name("q")).sendKeys("Om Nama S"
				+ "hovaya:");
		Thread.sleep(5000);
		
	}
	 
	@Test
	public void m3() {
		System.out.println("Third");
		
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
	public void Teardown() {
		driver.close();
	}
	
	
}
