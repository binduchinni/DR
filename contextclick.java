package actionclass;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.ChromeDriver;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class contextclick {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","D:\\New Selenium Docs\\geckodriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://amazon.in");
	  driver.manage().window().maximize();
	  Actions a1=new Actions(driver);
	  WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	  a1.contextClick(e1).build().perform();
  }
}
