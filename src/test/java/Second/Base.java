package Second;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.tools.JavaFileManager;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		/*ChromeOptions option= new ChromeOptions();
		option.addArguments("headless");
		option.addArguments("window-size:1400,800");
		option.addArguments("incognito");
		option.addArguments("start-maximized");
		option.addArguments("disable-infobars");
		option.addArguments("disable-popup-blocking");*/
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");	
		
	}
	public String takescreenhostFail(String TestCaseName) throws IOException {
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\salahari\\eclipse-workspace\\test\\screenshots\\Failed"+TestCaseName+".jpg");
		FileUtils.copyFile(Source, DestFile);
		return DestFile.toString();
		
	}
	public String takescreenhostPass(String TestCaseName) throws IOException {
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\salahari\\eclipse-workspace\\test\\screenshots\\passed\\"+TestCaseName+".jpg");
		FileUtils.copyFile(Source, DestFile);
		return DestFile.toString();
		
		
	}
	public void takesScreenshotSkip(String TestCaseName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SrcFile =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("C:\\Users\\salahari\\eclipse-workspace\\test\\screenshots\\passed\\"+TestCaseName+".jpg"));
		
	}
	
	
}
