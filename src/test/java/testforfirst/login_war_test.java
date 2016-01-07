package testforfirst;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class login_war_test { 
	


           public static   String click(String username, String password) {
																					
					        WebDriver Driver = new FirefoxDriver();
					        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					        Driver.get("http://www.700store.com/login");
							

					//输入用户名
					        Driver.findElement(By.id("txtEmail")).clear();
					        Driver.findElement(By.id("txtEmail")).sendKeys(username);

					//输入密码
					        Driver.findElement(By.id("txtPassword")).clear();
					        Driver.findElement(By.id("txtPassword")).sendKeys(password);

					//点击登录按钮
					        Driver.findElement(By.id("btnLogin")).click();
					        Driver.switchTo().defaultContent();
					        try {

					    //不停的检测，一旦当前页面URL不是登录页面URL，就说明浏览器已经进行了跳转
					            while (true) {
					                Thread.sleep(500);
					                if (!Driver.getCurrentUrl().startsWith("http://www.700store.com/login")) {
					                    break;
					                }
					            }
					        } catch (InterruptedException e) {
					            e.printStackTrace();
					        }
					      //获取cookie，上面一跳出循环我认为就登录成功了，当然上面的判断不太严格，可以再进行修改
					        Set<Cookie> cookies = Driver.manage().getCookies();
					        String cookieStr = "";
					        for (Cookie cookie : cookies) {
					            cookieStr += cookie.getName() + "=" + cookie.getValue() + "; ";
					        }
					        
					        System.out.print(cookieStr);
					        
					        
					        
					        
					//退出，关闭浏览器
					        Driver.quit();
					        return cookieStr;
					    
							

							} 
}