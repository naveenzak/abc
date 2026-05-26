package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowsersLaunching {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/a[2]")).click();
	  driver.close();
	  
  }
}
