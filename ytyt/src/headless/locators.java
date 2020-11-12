package headless;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//the path of chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\lol2\\chromedriver.exe");
		//making a new Webdriver called driver
 		WebDriver driver = new ChromeDriver();
 		//open Url
 		driver.get("https://www.facebook.com");
 		//using maximize option to maximize the screen  
 		driver.manage().window().maximize();
 		//using actions for using keyboard functions with variable called action
 		Actions action =new Actions(driver);
 		//using implicit wait for all the next steps 
 		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 	//to click in create new account using Xpath
 	driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
 //starting from name text box to password text box using Tab for moving 
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("smith");
action.sendKeys(Keys.TAB).sendKeys("elsharkawy").sendKeys(Keys.TAB).sendKeys("123456789")
.sendKeys(Keys.TAB).sendKeys("password").build().perform();
//select day with value from HTML
WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
if(day.isEnabled()&& day.isDisplayed()) {
 		Select day_value =new Select(day);
 		day_value.selectByValue("20");
}
// select month by visible text (using value which have the page without using HTMl values)
WebElement month=driver.findElement(By.id("month"));
if(month.isEnabled()&&month.isDisplayed()) {
Select month_value=new Select(month);
month_value.selectByVisibleText("May");
}
//select year by index method starting from 0>1>2>etc
WebElement year=driver.findElement(By.name("birthday_year"));
if(year.isEnabled()&&year.isDisplayed()) {
Select year_value=new Select(year);

year_value.selectByIndex(31);  //2020=1      
                                  //1990=..?  ==31  for select 1990
}
//select male (radio box)
WebElement male=driver.findElement(By.xpath("//input[@value='2']"));
if(male.isSelected()==false) {
	male.click();
}
//sing up button
driver.findElement(By.xpath("//button[@name='websubmit']")).click();

}


 		
 		
 		
 	

	}


