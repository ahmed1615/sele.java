package internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(linkText="Form Authentication")
	private WebElement FromA;
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(xpath="//*[@class='radius']")
	private WebElement login;
	
	
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}	
public void ClicOne() {
	FromA.click();
}
public void Putusernameandpassword(String na,String pa) {
	username.sendKeys(na);
	password.sendKeys(pa);

}
public void login() {
	login.click();
}
public void max() {
	driver.manage().window().maximize();
}
}
