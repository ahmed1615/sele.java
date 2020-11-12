package pages;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import org.apache.commons.*;
import org.apache.commons.io.file.*;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pages.RegistrationPage;


public class Test_RegistrationPage {
	

	@Test
	public void verifyFlightReg() {
		System.setProperty("webdriver.chrome.driver","C:\\lol2\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		TakesScreenshot screen=((TakesScreenshot) driver);
		
		RegistrationPage RGPage =new RegistrationPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().deleteAllCookies();
		RGPage.clickrigester();
		RGPage.Change_the_frame();
		RGPage.close_v();
		RGPage.back_to_the_main_page();
		RGPage.setfirstname("iteducation");
		RGPage.setlastname("java");
		RGPage.setphone("123456789");
		RGPage.setemail("java@iteducation.com");
		RGPage.setaddress("18 st BA");
		RGPage.setcity("BA");
		RGPage.setstate("CABA");
		RGPage.setpostalcode("1212");
		RGPage.Select_country();
		RGPage.Select_country();
		RGPage.setusername("IT");
		RGPage.setpassword("102030");
		RGPage.setconfirmpassword("102030");
		RGPage.clickbutton();
		RGPage.Check_text();
		
		
	}
	
	
	

}
