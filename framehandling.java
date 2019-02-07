package frames;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class framehandling {
  @Test
  public void f() throws Exception{
	  System.setProperty("webdriver.gecko.driver","D:\\New Selenium Docs\\geckodriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://jqueryui.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Autocomplete")).click();
	  Thread.sleep(2000);
	  //switch lock to default content
	  driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("Accordion")).click();
  }
}
