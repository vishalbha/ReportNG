package reportingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("lst-ib")).sendKeys("Testng");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "src/lib/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://www.google.com");
  }

  @AfterClass
  public void afterClass() {
  }

}
