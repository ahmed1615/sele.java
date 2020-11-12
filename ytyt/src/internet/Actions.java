
package internet;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import internet.HomePage;

public class Actions {
	String URL="https://the-internet.herokuapp.com/";
	WebDriver driver;
	@Test
public void verify() {	
		WebDriver driver=new ChromeDriver();
	HomePage HP=new HomePage(driver);
	System.setProperty("webdriver.chrome.driver","C:\\lol2\\chromedriver.exe");
	driver.get(URL);
	HP.max();
	HP.ClicOne();
	HP.Putusernameandpassword("ahmed","shmanana");
	HP.login();
	
}

}
