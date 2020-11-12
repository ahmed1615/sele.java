package headless;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		List< WebElement >links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			URL link=new URL(url);
			HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();
			httpConn.connect();
			int response=httpConn.getResponseCode();
			if (response>=400) {
				System.out.println(url+"-"+"is broken link");
			}
			else {
				System.out.println(url+"-"+"is valid link");
				
			}
			
			
		}
		
		//driver.findElement(By.partialLinkText("Business")).click();
		

	}

}
