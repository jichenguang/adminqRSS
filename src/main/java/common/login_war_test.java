package common;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;



public class login_war_test { 
	


           public static   String click(String username, String password) throws InterruptedException {
										
        	   
        	   				String url = "http://www.700store.com/login";
        	   				
        	   				
					        WebDriver Driver = new FirefoxDriver();
					        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					        Driver.get(url);
							

					//输入用户名
					        Driver.findElement(By.id("txtEmail")).clear();
					        Driver.findElement(By.id("txtEmail")).sendKeys(username);

					//输入密码
					        Driver.findElement(By.id("txtPassword")).clear();
					        Driver.findElement(By.id("txtPassword")).sendKeys(password);

					//点击登录按钮
					        Driver.findElement(By.id("btnLogin")).click();
					        Driver.switchTo().defaultContent();
					        (new WebDriverWait(Driver, 10)).until(new ExpectedCondition<Boolean>() {
								public Boolean apply(WebDriver Driver2) {
									return Driver2.getTitle().toLowerCase().indexOf("首页") != -1;
								}
							});
					        
					        
							String responseBody = Driver.getPageSource();
							System.out.println("Response : " + responseBody);
							
					        
					        
					//退出，关闭浏览器
					        Driver.quit();
					        return responseBody;
					    
							

							} 
}