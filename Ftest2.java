package frames;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Ftest2 {
  @Test
  public void f() throws Exception{
	  System.setProperty("webdriver.gecko.driver","D:\\New Selenium Docs\\geckodriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://retail.onlinesbi.com/retail/login html");
	  String str=driver.getPageSource();
	  System.out.println(str);
	  driver.findElement(By.linkText("CONTINUE TO LOG")).click();
	  driver.findElement(By.id("username")).sendKeys("");
	  Thread.sleep(4000);
	  driver.findElement(By.name("")).sendKeys("");
  }
}
