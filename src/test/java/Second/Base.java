package Second;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String Browser = "Chrome";
	//public static Logger log = Logger.getLogger(Base.class);
	
	public void intialization() {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\salahari\\Downloads\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");	
		
	}
	public void takescreenhostFail(String TestCaseName) throws IOException {
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(Source, new File("C:\\Users\\salahari\\eclipse-workspace\\test\\screenshots\\Failed"+TestCaseName+".jpg"));
		
	}
	public void takescreenhostPass(String TestCaseName) throws IOException {
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(Source, new File("C:\\Users\\salahari\\eclipse-workspace\\test\\screenshots\\passed\\"+TestCaseName+".jpg"));
		
	}
	
	
	
}
