package tstng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
	
	
	
  @Test (priority=1)
  public void verify_test() {
	  System.out.println(0);
	 String title= driver.getTitle();
	 System.out.println(title);
	 String hol="kjdkj";
	 if(title.equals(hol)==false) {
		 System.out.println("it is ok");
	 }
	 
	
  }
  @Test(priority=2)
  public void verifylogo_test() {
boolean flag=driver.findElement(By.xpath("//*[@class='brand-name']")).isDisplayed();
	 // assert.assertEquals(actual, expected);
System.out.println(flag);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(4);
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(5);
	  driver.quit();
  }


  
  @BeforeClass
  public void beforeClass() {
	  System.out.println(3);
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(6);
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(2);
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(7);
  }

  @BeforeSuite
  //setup()
  public void setup() {
	  System.out.println(1);
	  System.setProperty("webdriver.chrome.driver","C:\\lol2\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.manage().deleteAllCookies();
	  driver.get("https://freecrm.com/");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(8);
  }

}
