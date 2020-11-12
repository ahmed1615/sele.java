package automationpractice;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import automationpractice.locators;

public class Test_aitomation {
	@Test
	public void verify_Atumation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\lol2\\chromedriver.exe");
		String Url="http://automationpractice.com/index.php";
		WebDriver driver =new ChromeDriver();
		locators AUTO =new locators(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Url);
		driver.manage().deleteAllCookies();
		String title="My Store";
		 String R_title=driver.getTitle();
		 if(title.equals(R_title)==true) {
			 System.out.println("we have the same title");
		 }
		 String current=driver.getCurrentUrl();
		 if(Url.contentEquals(current)==true) {
			 System.out.println("we have the same current");
		 }
		 AUTO.Click_login();
		 System.out.println("title after log in"+driver.getTitle());
		 AUTO.Setemail("elsharkawyahmed028@gmail.com");
		 AUTO.Click_B();
		 AUTO.Choose_male();
		 AUTO.Set_cfirstname("ahmed");
		 AUTO.Set_clastname("mohamed");
		 AUTO.Click_email();
		 AUTO.Write_pass("12345abcd");
		 AUTO.Select_day();
		 AUTO.Select_month();
		 AUTO.Select_year();
		 AUTO.Click_New();
		 AUTO.Setfirstname("ahmed");
		 AUTO.Setlastname("mohamed");
		 AUTO.SetCompany("it education");
		 AUTO.Setaddress("20st BA");
		 AUTO.Setaddress2("20st CABA");
		 AUTO.Setcity("ALEXANDRIA");
		 AUTO.Select_state();
		 AUTO.SetZip("20304");
		 AUTO.WriteText("welcome in selenuim java");
		 AUTO.Write_homephone("1234567");
		 AUTO.Write_mobilephone("0123456789");
		 AUTO.Write_alis("nothing");
		 AUTO.Click_finsih();
		 System.out.println("title after ceating acc"+driver.getTitle());
		 String f=driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
 String t="Welcome to your account.Here you can manage all of your personal information and orders.";
		if(f.matches(t)==true) {
			System.out.println("your test is ok");
		}
		
	
	
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
