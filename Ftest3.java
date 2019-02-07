package frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Ftest3 {
  @Test
  public void f() throws Exception{
	  System.setProperty("webdriver.gecko.driver","D:\\New Selenium Docs\\geckodriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://the-Enternet.herokuapp.com/tinymce");
	  driver.manage().window().maximize();
	  WebElement frame1=driver.findElement(By.id("mce-o"));
	  driver.switchTo().frame(frame1);
	  WebElement editable=driver.switchTo().activeElement();
	  editable.sendKeys("welcome to selenium");
  }
}
