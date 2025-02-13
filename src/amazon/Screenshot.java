package amazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Screenshot extends TestListenerAdapter
{

	
	
public void onTestFailure(ITestResult tr)
{
	
	//Which Class need to take screenshot
	File failedScreenshots = ((TakesScreenshot)VerifyInvalidPasswordErrorMsg.driver).getScreenshotAs(OutputType.FILE);
	
	//Where we need to save screenshots
	try {
		FileUtils.copyFile(failedScreenshots, new File("E:\\GMAILScreenshots\\" + tr.getName()+".PNG"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
