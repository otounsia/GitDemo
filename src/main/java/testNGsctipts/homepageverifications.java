package testNGsctipts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homepageverifications {
  @Test
  public void homepageverification() {
	  
	  System.setProperty("Webdriver.chrome.driver" ,"E:\\TOUTOU\\SELENIUM\\maventestNG\\src\\main\\java\\jenkings\\maventestNG\\chromedriver.exe");
		//"E:\\TOUTOU\\SELENIUM\\BDDFramework\\src\\main\\java\\Selenium\\BDDFramework\\chromedriver.exe");
				
		WebDriver driver =new ChromeDriver();
		
	
		driver.get("https://www.amazon.com/");
	boolean hpstatus = driver.findElement(By.id("nav-your-amazon")).isDisplayed();
	Assert.assertTrue(hpstatus);
	driver.close();
	driver.quit();
  }


}
