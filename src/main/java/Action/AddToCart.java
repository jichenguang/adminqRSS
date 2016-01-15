package Action;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;




public class AddToCart {
	
	
	
	static String url_addToCart = "http://www.700store.com/addtocartaction?ProductRoute=baihua&SkuId=76&OrderQuantity=1";	
	static Cookie usercookie = null;
	
	
	public static void addToCart(Cookie myCookie, WebDriver Driver) throws InterruptedException,IllegalStateException, IOException {
		
		
		 /* Driver+cookie,拼出一个请求。*/
		 
		
		usercookie =  myCookie ;
		Driver.manage().addCookie(usercookie);	
		Driver.get(url_addToCart);  
		System.out.println("executing request： " + Driver.getCurrentUrl());
		
		String responseBody = Driver.getPageSource();
		
		
		
		
		
	}
	
	
	


}
