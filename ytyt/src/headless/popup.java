package headless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//http://username:password@test.com
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
String text=	driver.findElement(By.cssSelector("p")).getText();
	
	System.out.println(text);
	}

}
