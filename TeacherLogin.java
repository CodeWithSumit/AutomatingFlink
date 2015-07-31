package automationFramework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class FlinkLearning {
	public WebDriver driver;
  @Test
  public void main() {
	 
	  JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		 //Execute the Javascript code of finding the input tag and searching through the needed button among the input tags to click it with executeScript function

		 jsExecutor.executeScript("var InputElements = document.getElementsByTagName('Teacher Login');"

		 + "for (i=0; i<InputElements.length; i++)"

		 + "{"

		 + "if(InputElements[i].value == '<Text On Button>')"

		 + "{"

		 + "InputElements[i].click();"

		 + "}"

		 + "}"

		 );
	 
	 //driver.findElement(By.xpath("//*[@id='main-nav']/li[9]/a")).click();
	  System.out.println("Test Pass");
	  driver.findElement(By.name("LoginForm[username]")).sendKeys("qatesting@peter.com");
	  driver.findElement(By.name("LoginForm[password]")).sendKeys("123456"); 
  }
	  
	//*[@id="ctl00_AdminLinks1_lnkLogin"]

  

@BeforeMethod
  public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("http://dev.flinklearning.com/");
	 
	/* System.out.println("Testing Start at IE");
	 System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer_Win32_2.47.0\\IEDriverServer.exe");
	 driver = new InternetExplorerDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("http://dev.flinklearning.com/");*/
  }

  @AfterMethod
  public void afterMethod() {
	 //driver.quit();
  }

}
