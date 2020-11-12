package ytyt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;




public class lplp {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			//WebDriver driver = new ChromeDriver(option);
			//driver.get("https://serene-einstein-62858a.netlify.app/index.html");
			
		//driver.get("http://demo.guru99.com/test/newtours/reservation.php");
			//driver.get("https://www.google.com/");
			driver.get("https://www.espanol.skyscanner.com/");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //global:D
			//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			//driver.manage().deleteAllCookies();
			//WebElement travel= driver.findElement(By.xpath("//input[@value='Business']"));
			//travel.click();
			//System.out.println(travel.isSelected());
			//driver.findElement(By.xpath("//*[@type='text']")).click();
			
		//	List<WebElement>check= driver.findElements(By.xpath("//input[@type='checkbox']"));
	//	int count =check.size();
		
	//	for(int i=0; count>i; i++)
		//{
			//check.get(i).click();
		//}
			Actions action =new Actions(driver);
			action.moveToElement(driver.findElement
			(By.id("fsc-origin-search"))).click().sendKeys(Keys.DELETE).sendKeys("cairo")
			.sendKeys(Keys.TAB).sendKeys(Keys.DELETE).sendKeys("paris").build().perform();
			int count=6;
			
			for (int i=0; count>i ;i++)
					
			{
				action.sendKeys(Keys.TAB).build().perform();;
			}
				action.sendKeys(Keys.ENTER).build().perform();;
		
		
			
			
			
			
		
			
			
		
		
		
		

	}

}
