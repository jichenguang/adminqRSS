package Action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageEditPro {

	public static void editPro(String Name, String Ad, WebDriver driver) {
		// TODO Auto-generated method stub
		
		
		WebElement myElement1 = driver.findElement(By.xpath(".//*[@id='txtProductName']"));
		myElement1.sendKeys(Name);
		String myName = myElement1.getAttribute("value");//input元素的value不可见
		System.out.println("商品名称：" + myName);
		
		
		
		WebElement myElement2 = driver.findElement(By.xpath(".//*[@id='txtAd']"));
		myElement2.sendKeys(Ad);
		String myAd = myElement2.getAttribute("value");
		System.out.println("广告语：" + myAd);
		
		
        List<WebElement> elements3 = driver.findElements(By.name("ctl00$ContentPlaceHolder1$rdStatus"));
        int index = 0;
        elements3.get(index).click();
        boolean select3 = elements3.get(index).isSelected();
        System.out.println("商品上架状态：" + select3);
        
        
        
		
		WebElement myElement4 = driver.findElement(By.id("txtPrice"));
		myElement4.clear();
		myElement4.sendKeys("999");
		String myPrice = myElement4.getAttribute("value");
		System.out.println("售价：" + myPrice);		
		
		
		
		WebElement myElement5 = driver.findElement(By.id("txtPromotionPrice"));
		myElement5.clear();
		myElement5.sendKeys("777");
		String myPromotionPrice = myElement5.getAttribute("value");
		System.out.println("促销价：" + myPromotionPrice);		
		
		
		
		WebElement myElement6 = driver.findElement(By.id("txtUnit"));
		myElement6.clear();
		myElement6.sendKeys("个");
		String myUnit = myElement6.getAttribute("value");
		System.out.println("单位：" + myUnit);
		

		ToolRichText.testRichText(driver);
		
		
/*		.//*[@id='txtSeoTitle']
		.//*[@id='txtSeoKeywords']
		.//*[@id='txtSeoDescription']
		
		*/
		WebElement myElement7 = driver.findElement(By.xpath(".//*[@id='txtSeoTitle']"));
		myElement7.clear();
		myElement7.sendKeys("测试SeoTitle");
		String mySeoTitle = myElement7.getAttribute("value");
		System.out.println("SeoTitle：" + mySeoTitle);
		
		
		WebElement myElement8 = driver.findElement(By.xpath(".//*[@id='txtSeoKeywords']"));
		myElement8.clear();
		myElement8.sendKeys("测试SeoKeywords");
		String mySeoKeywords = myElement8.getAttribute("value");
		System.out.println("SeoKeywords：" + mySeoKeywords);
		
		
		WebElement myElement9 = driver.findElement(By.xpath(".//*[@id='txtSeoDescription']"));
		myElement9.clear();
		myElement9.sendKeys("测试txtSeoDescription");
		String mytxtSeoDescription = myElement9.getAttribute("value");
		System.out.println("SeoKeywords：" + mytxtSeoDescription);
		
		
/*		.//*[@id='btnSaveProduct']
		.//*[@id='btnSubmitProduct']
*/		
		WebElement myElement10 = driver.findElement(By.xpath(".//*[@id='btnSaveProduct']"));
		myElement10.click();
		WebElement SaveSuccess = driver.findElement(By.xpath(".//*[@id='lbSaveSuccess']"));
		SaveSuccess.isDisplayed();
		System.out.println(SaveSuccess.getText());
		
		
		WebElement myElement11 = driver.findElement(By.xpath(".//*[@id='btnSubmitProduct']"));
		myElement11.click();
/*		boolean IsButtonSubmit = myElement11.isEnabled();
		System.out.println(IsButtonSubmit);*/
		
		System.out.println("商品"+ "#" + myName + "#" +"创建成功！");


		


        
		
	}
	
	
	

}
