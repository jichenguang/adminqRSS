package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolRichText {
	
	

	
	

public static void testRichText(WebDriver driver)
  {

      
//    driver.switchTo().frame("content_ifr");
      WebElement editor = driver.findElement(By.xpath(".//*[@id='xhe0_container']/table"));
      JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
      jsExecutor.executeScript(
    		  "arguments[0].innerHTML ="
    		  + " '<h1>Selenium Test </h1>I love Selenium <br> this article Post By Selenium WebDriver<br>"
    		  + "<h2>Create By Young</h2>'", editor);
       
//    driver.switchTo().defaultContent();
      
      

      

  }



}
