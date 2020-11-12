package DataProvided;

import org.testng.annotations.Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;

public class Read {

	@Test(dataProvider="testdata")
	public void login(String username, String password) {
		System.setProperty("webdriver.chrome.driver","C:\\lol2\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html?e=1");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	 driver.findElement(By.xpath("//input[@value='Login']")).click();
	 driver.close();
	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed()
	{
		Object[][]data=new Object[2][2];
		data[0][0]="ahmed";
		data[0][1]="pkhgv";
		data[1][0]="user2";
		data[1][1]="jhdfjhd";
		return data;
		
		
		
		
		
		
		
		
		
	}
	
	

		
	

}

