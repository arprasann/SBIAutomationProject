package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyHomePage 
{
public WebDriver driver;

@Test(priority = 0)
public void movetoAccountsandLists() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "E:\\Batch_80\\Batch80\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement helloSignIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
Actions action = new Actions(driver);
action.moveToElement(helloSignIn).perform();
Thread.sleep(2000);
}

@Test(priority = 1)
public void clickOnSignInButton() throws InterruptedException
{
	driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
	Thread.sleep(2000);
	Assert.assertEquals("abc", "xyz");
}
	
	
}
