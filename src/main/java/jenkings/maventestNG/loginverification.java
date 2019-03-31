package jenkings.maventestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginverification {
	public WebDriver driver;
@ Test 
  public void loginverificatio () {
	
	System.setProperty("Webdriver.chrome.driver" ,"E:\\TOUTOU\\SELENIUM\\maventestNG\\src\\main\\java\\jenkings\\maventestNG\\chromedriver.exe");
			//"E:\\TOUTOU\\SELENIUM\\BDDFramework\\src\\main\\java\\Selenium\\BDDFramework\\chromedriver.exe");
	
	 driver =new ChromeDriver();
	

	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/");
	
	driver.findElement(By.id("nav-your-amazon")).click();
	boolean logpstatus = driver.findElement(By.id("sinInSubmit")).isDisplayed();
	Assert.assertTrue(logpstatus);
	driver.close();
	driver.quit();
	
  }
}