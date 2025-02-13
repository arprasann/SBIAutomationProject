package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyInvalidPasswordErrorMsg 
{
public static WebDriver driver;


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

@Test(priority = 2)
public void enterUserName() throws InterruptedException
{
	driver.findElement(By.name("email")).sendKeys("8711013119");
	Thread.sleep(2000);
}

@Test(priority = 3)
public void clickOnContinueButton() throws InterruptedException
{
	driver.findElement(By.id("continue")).click();
	Thread.sleep(2000);
	Assert.assertEquals("abc", "xyz");
}

@Test(priority = 4)
public void enterPasswordAndClickOnSignButton() throws InterruptedException
{
	driver.findElement(By.id("ap_password")).sendKeys("232783456");
	
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(2000);
	
}

@Test(priority = 5)
public void verifyInvalidLoginPageErrorMsg() throws InterruptedException
{
	WebElement invalidErrorMsg = driver.findElement(By.xpath("//*[contains(text(),'Your password is incorrect')]"));
               String text = invalidErrorMsg.getText();
               System.out.println(text);
               Thread.sleep(4000);
Assert.assertEquals(text, "Your password is incorrect1111");
Thread.sleep(2000);
}

	
	
}
