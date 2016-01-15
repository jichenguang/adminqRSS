package untest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.openqa.selenium.Cookie;



@SuppressWarnings("deprecation")
public class AddCart_test { 
	

	 @SuppressWarnings("resource")
	 		public static void addToCart(String myCookie) throws InterruptedException,IllegalStateException, IOException {
			
  	   			
		String url_addToCart = "http://www.700store.com/addtocartaction?ProductRoute=baihua&SkuId=76&OrderQuantity=1";

	
	//判断“加入购物车”是否成功。
				HttpClient httpclient = new DefaultHttpClient();
				
				/*@
				 * 创建一个请求，用于加入购物车。
				 */
				
			    try {
			        /*HttpGet httpget = new HttpGet(url_addToCart);
			        httpget.addHeader(new BasicHeader("Cookie",cookie));*/
			        		       
					HttpGet httpget = new HttpGet(url_addToCart);
					
					/*@
					 * 从登录页面获取cookie;
					 */
					Header header = new BasicHeader("Cookie",myCookie);
					httpget.addHeader(header);
			        System.out.println("executing request： " + httpget.getURI());
			        HttpResponse response = null;
			        
			        /*@
			         * 发送这个请求,并获得响应
			         */
					try {
						response = httpclient.execute(httpget);
					} catch (ClientProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
			        HttpEntity entity = response.getEntity();
			        System.out.println("----------------------------------------");
			        System.out.println(response.getStatusLine());
			        if (entity != null) {
			            System.out.println("Response content length: " + entity.getContentLength());
			        }
			        System.out.println("----------------------------------------");

			        //InputStream inSm = entity.getContent();
			        //Scanner inScn = new Scanner(inSm);
			        //while (inScn.hasNextLine()) {
			        //    System.out.println(inScn.nextLine());
			        //}
			        // Do not feel like reading the response body
			        // Call abort on the request object
			        httpget.abort();
			    } finally {
			        // When HttpClient instance is no longer needed,
			        // shut down the connection manager to ensure
			        // immediate deallocation of all system resources
			    	
			    	//退出，关闭浏览器

//			        httpclient.getConnectionManager().shutdown();
//			        return  clientStatusCode;

			    }
				
				}

			}


