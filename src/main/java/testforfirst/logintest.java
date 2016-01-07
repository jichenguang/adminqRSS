package testforfirst;

import common.AddCart_test;
import common.Login_test;

public class logintest {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		
		try {
			Login_test.click("18611360619", "mljicj00");
			AddCart_test.addCart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
