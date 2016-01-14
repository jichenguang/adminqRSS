package testforfirst;

import java.io.IOException;

import common.AddCart_test;
import common.GetCookie;
import common.Login_test;

public class StartScript {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		String PraUsername = "18611360619";
		String PraPassword = "mljicj00";
		String MyCookie = "";
		
		try {
			
			/*@
			 * 登录
			 */
			Login_test.clickForLogin(PraUsername, PraPassword);
			
			
			/*@
			 * 获取Cookie，目的是保持用户登录状态
			 */
			MyCookie = GetCookie.getCookie(PraUsername, PraPassword);
			
			
			/*@
			 * 将商品加入购物车
			 */
			AddCart_test.addToCart(MyCookie);
			
			
			
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
