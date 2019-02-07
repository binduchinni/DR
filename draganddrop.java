package actionclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class draganddrop  {
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.gecko.driver","D:\\New Selenium Docs\\geckodriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://jqueryui.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  WebElement src=driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
	  WebElement dest=driver.findElement(By.xpath("//*[text()='Drop here']"));
	  Actions builder=new Actions(driver);
	  builder.clickAndHold(src).moveToElement(dest).release(src).perform();
	  
  }
}
