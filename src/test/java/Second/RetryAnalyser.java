package Second;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.internal.TestResult;

public class RetryAnalyser implements IRetryAnalyzer{
	int counter =0;
	int RetryLimit =2;
	public boolean retry(ITestResult result) {
		if(counter<RetryLimit) {
			counter++;
			return true;
		}
		return false;
	}
	

}
