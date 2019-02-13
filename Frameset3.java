package frames;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Frameset3 {
  @Test
  public void f() throws Exception{
	  System.setProperty("webdriver.gecko.driver","D:\\New 
Selenium Docs\\geckodriver\\geckodriver.exe");Selenium Docs\\geckodriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://only-testng-blog.blogspot.in");
	  driver.manage().window().maximize();
	  driver.switchTo().frame("frame1");
	  driver.findElement(By.xpath("")).click();
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("frame2");
	  driver.findElement(By.xpath("")).click();
  }
}
