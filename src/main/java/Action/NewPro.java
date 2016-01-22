package Action;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import common.MySelect;

public class NewPro {
	
	

	public static void NewProduct(Cookie myCookie, WebDriver Driver){
		
		
		Driver.findElement(By.xpath(".//*[@id='menu-nav']/li[25]/a")).click();
		System.out.println("进入新建商品页面");
		
		MySelect myselect =new MySelect();
		PageSelect.testSelect("周边","头盔", Driver);
		

		PageEditPro.editPro("防风口罩","行走江湖，安全第一",Driver);


		
	}
    

}
