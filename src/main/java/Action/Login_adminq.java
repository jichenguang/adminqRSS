package Action;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Login_adminq { 
	
						

	
	static String adminq_url = "http://adminq.700paper.cn/index";
	
	
           public static  boolean clickForLogin(String PraUsernamesername, String PraPassword, WebDriver Driver) throws InterruptedException {
	
        	   				Driver.manage().deleteAllCookies();
					        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					        Driver.get(adminq_url);

					//输入用户名
					        Driver.findElement(By.id("txtUserName")).clear();
					        Driver.findElement(By.id("txtUserName")).sendKeys(PraUsernamesername);

					//输入密码
					        Driver.findElement(By.id("txtPassword")).clear();
					        Driver.findElement(By.id("txtPassword")).sendKeys(PraPassword);

					        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					//点击登录按钮
					        
					        Driver.findElement(By.id("btnLogin")).click();

					        
					//获取Title,判断是否登陆成功。
					        
					        Driver.switchTo().defaultContent();
					        String content = Driver.findElement(By.xpath(".//*[@id='user-info']/span")).toString();					        
				try {  
					 if(PraUsernamesername.equals(content));
					       System.out.println(content + " is appeard!");  
                           System.out.println("登陆成功！");
                           return true;
					 }       catch (NoSuchElementException e) {  
			        	   System.out.println("'" + content + "' doesn't exist!");  
			        	   System.out.println("登陆失败！");
			        	   return false;
					     }  
					        			

					 //获取页面HTML信息。
							//String responseBody = Driver.getPageSource();
							//System.out.println("Response : " + responseBody);
							      
					        
					//退出，关闭浏览器
					        //Driver.quit();
					        //return responseBody;

							

			
		} 
           

}