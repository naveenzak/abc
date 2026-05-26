package browsers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TechlearnLogin {
	WebDriver driver;
  @Test
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @Test
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  @Test
  public void techlearn() {
	  driver.get("https://www.techlearn.in");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
