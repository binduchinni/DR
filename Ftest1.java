package frames;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Ftest1 {
  @Test
  public void f() throws Exception{ 
	  System.setProperty("webdriver.gecko.driver","D:\\New Selenium Docs\\geckodriver\\geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  driver.get("https://netbanking.hdfcbank.com/netbanking/");
  driver.switchTo().frame("login-page");
  driver.findElement(By.cssSelector("input[class='input']"));
}
}
