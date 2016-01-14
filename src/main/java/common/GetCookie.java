package common;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCookie {
	
	public static   String getCookie(String PraUsernamesername, String PraPassword) {
	
	 
	 WebDriver Driver_GetCookie = Login_test.Driver;
	 Login_test.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*	 try {
		Login_test.clickForLogin(PraUsernamesername, PraPassword);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch blockd
		e.printStackTrace();
	}
	*/
    //获取cookie，上面一跳出循环我认为就登录成功了，当然上面的判断不太严格，可以再进行修改
    Set<Cookie> cookies = Driver_GetCookie.manage().getCookies();
    System.out.println("cookie总数为"+cookies.size());

    String cookieStr = "";
    for (Cookie cookie : cookies) {
        cookieStr += cookie.getName() + "=" + cookie.getValue() + "; ";
    }
    
    System.out.print(cookieStr);
    return cookieStr;

	}
}
