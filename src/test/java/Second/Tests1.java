package Second;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests1 extends Base {
	

@BeforeMethod
public void setup() {

	intialization();

}
	@Test
	  public void m1() {	
		System.out.println("Test cases is being executed from Tests1. and Methods is m1");
		
		Assert.assertEquals("Google", driver.getTitle());	
 
	  }
	@Test
	public void m2() {
		System.out.println("Test cases is being executed from Tests1. and Methods is m2");
		driver.findElement(By.name("q")).sendKeys("Om Nama S"
				+ "hovaya:");
		
	}
	 
	@Test
	public void m3() {
		System.out.println("Test cases is being executed from Tests1. and Methods is m3");
		
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
