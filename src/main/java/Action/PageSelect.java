package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageSelect {
	
	

    public static String testSelect(String value1,String value2,WebDriver Driver) {
    	
    	
		/*@
		 * 选择一级分类
		 */
    	WebElement element1 = Driver.findElement(By.id("selCategory"));
        Select select1 = new Select(element1);        
        select1.selectByVisibleText(value1);/*选择text，应该是ByVisbleText---尹瑞-透云物联网科技*/        
        String text1 = select1.getFirstSelectedOption().getText();
//        System.out.println(text1);
        /*@
         * 选择二级分类
         */
        WebElement element2 = Driver.findElement(By.xpath(".//*[@id='selChildCategory']"));
        Select select2 = new Select(element2);
//        select2.deselectByVisibleText(value2);
        select2.selectByIndex(6);/*这个也可以,VisibleText效果好很多*/
        String text2 = select2.getFirstSelectedOption().getText();
        System.out.println(text2);
        
        /*@
         * 输出商品分类
         */
        String text = text1+">>"+text2;
        System.out.println("商品分类："+ text);
        
        WebElement NextButton =Driver.findElement(By.xpath(".//*[@id='btnNext']"));
        NextButton.click();
        
		return text;

        

    }

}
