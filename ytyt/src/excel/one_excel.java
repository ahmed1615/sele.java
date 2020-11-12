package excel;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class one_excel {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&AppName=LithiumT-7567-42e3-a620-0b7cf8ee50ee&ru=https%3A%2F%2Fauth.ebay.com%2Foauth2%2Fconsents%3Fclient_id%3DLithiumT-7567-42e3-a620-0b7cf8ee50ee%26redirect_uri%3DLithium_Technol-LithiumT-7567-4-khvro%26scope%26state%3Dv8qwHfx2WKoVeswMcCi8CaNR0dbSwQZHLEha0Iozi2WoR8huUS2qzrq912GG4hetcg4M3FiyfHIY6oszdmj%252FEZssJKQmazMDGaX0W6Zhr1pmqIdvNeZNyq6JLCdDxtbnMsAHAvr7jcpyo4ZJ9B91nFuzpBi66%252FkJh6Cky4U4GQk3JBVVg%252FodguU0dWpNqxZ6wFZb1USDuDt26CSfsNilXg%253D%253D%26response_type%3Dcode%26hd%26consentGiven%3Dfalse&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26AppName%3DLithiumT-7567-42e3-a620-0b7cf8ee50ee%26ru%3Dhttps%253A%252F%252Fauth.ebay.com%252Foauth2%252Fconsents%253Fclient_id%253DLithiumT-7567-42e3-a620-0b7cf8ee50ee%2526redirect_uri%253DLithium_Technol-LithiumT-7567-4-khvro%2526scope%2526state%253Dv8qwHfx2WKoVeswMcCi8CaNR0dbSwQZHLEha0Iozi2WoR8huUS2qzrq912GG4hetcg4M3FiyfHIY6oszdmj%25252FEZssJKQmazMDGaX0W6Zhr1pmqIdvNeZNyq6JLCdDxtbnMsAHAvr7jcpyo4ZJ9B91nFuzpBi66%25252FkJh6Cky4U4GQk3JBVVg%25252FodguU0dWpNqxZ6wFZb1USDuDt26CSfsNilXg%25253D%25253D%2526response_type%253Dcode%2526hd%2526consentGiven%253Dfalse");
		
	}
	@Test
	public void test() {
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
