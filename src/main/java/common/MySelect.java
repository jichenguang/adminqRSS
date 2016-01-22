
package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MySelect {

	

    public void testSelect(String value1,String value2,WebDriver Driver) {
    	
    	

    	WebElement element1 = Driver.findElement(By.id("selCategory"));
        Select select1 = new Select(element1);        
        select1.selectByVisibleText(value1);/*选择text，应该是ByVisbleText---尹瑞-透云物联网科技*/
        
        String text1 = select1.getFirstSelectedOption().getText();
        System.out.println(text1);
        
        WebElement element2 = Driver.findElement(By.xpath(".//*[@id='selChildCategory']"));
        Select select2 = new Select(element2);
        select2.deselectByVisibleText(value2);
        String text2 = select2.getFirstSelectedOption().getText();
        System.out.println(text2);
        
        
        WebElement NextButton =Driver.findElement(By.xpath(".//*[@id='btnNext']"));
        NextButton.click();
        

    }
}
