package testforfirst;

import java.io.IOException;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Action.Login_test;
import common.GetCookie;
import untest.AddCart_test;

public class StartScript {
	
	
	public static WebDriver Driver = new FirefoxDriver();
	static String PraUsername = "18611360619";
	static String PraPassword = "mljicj00";
	static String MyCookie = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		// TODO Auto-generated method stub
		

		
		try {
			
			/*@
			 * 登录
			 */
			Login_test.clickForLogin(PraUsername, PraPassword, Driver);
			
			
			/*@
			 * 获取Cookie，目的是保持用户登录状态
			 */
			MyCookie = GetCookie.getCookie(PraUsername, PraPassword, Driver);
			
			
			/*@
			 * 将商品加入购物车
			 */
			AddCart_test.addToCart(MyCookie);
			/*AddToCart.addToCart(MyCookie, Driver);*/
			
			
			
			/*
			 * 关闭所有浏览器
			 */
	        Thread.sleep(3000);
	        Driver.quit();  
			
			
			
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
