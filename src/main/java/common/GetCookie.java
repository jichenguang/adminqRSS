package common;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCookie {
	
	
	public static   String getCookie(String username, String password) {
	
	 WebDriver Driver = new FirefoxDriver();
     Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     Driver.get("http://www.700store.com/login");
	
    //获取cookie，上面一跳出循环我认为就登录成功了，当然上面的判断不太严格，可以再进行修改
    Set<Cookie> cookies = Driver.manage().getCookies();
    String cookieStr = "";
    for (Cookie cookie : cookies) {
        cookieStr += cookie.getName() + "=" + cookie.getValue() + "; ";
    }
    
    System.out.print(cookieStr);
    return cookieStr;

	}
}
