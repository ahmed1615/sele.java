
package pages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;
	@FindBy(linkText="REGISTER")
	private WebElement Register;
	@FindBy(id="closeBtn")
	private WebElement close_1;
	@FindBy(name ="firstName")
	private WebElement Firstname;
	@FindBy(name="lastName")
	private WebElement Lastname;
	@FindBy(name="phone")
	private WebElement Phone;
	@FindBy(id="username")
	private WebElement Email;
	@FindBy(name="address1")
	private WebElement Address;
	@FindBy(name="city")
	private WebElement City;
	@FindBy(name="state")
	private WebElement State;
	@FindBy(name="postalCode")
	private WebElement PostalCode;
	@FindBy(name="country")
	private WebElement Country;
	@FindBy(name="email")
	private WebElement Username;
	@FindBy(name="password")
	private WebElement Password;
	@FindBy(name="confirmPassword")
	private WebElement Confirmpassword; 
	@FindBy(name="submit")
	private WebElement button;
	@FindBy(css="tr:nth-child(3) td:nth-child(1) p:nth-child(1) font:nth-child(1) > b:nth-child(1)")
	private WebElement Text;
	public RegistrationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	public void clickrigester() {
		Register.click();
		}
		public void Change_the_frame() {
			driver.switchTo().frame("flow_close_btn_iframe");
			
		}
	
	public void close_v() {
		close_1.click();
		}
	public void back_to_the_main_page(){
		driver.switchTo().defaultContent();
	}
	public void setfirstname(String fname) {
	Firstname.sendKeys(fname);
	}
	public void setlastname(String flastname) {
		Lastname.sendKeys(flastname);
	}
	public void setphone(String fphone) {
		Phone.sendKeys(fphone);
	}
	public void setemail(String fmail) {
		Email.sendKeys(fmail);
	}
	public void setaddress(String faddress) {
		Address.sendKeys(faddress);
	}
	public void setcity(String fcity) {
		City.sendKeys(fcity);
	}
	public void setstate(String fstate) {
		State.sendKeys(fstate);
	}
	public void setpostalcode(String fpostalcode) {
		PostalCode.sendKeys(fpostalcode);
	}

		
	public void setcountry() {
		Country.click();
	}
	public void Select_country() {
		Select c=new Select(Country);
		c.selectByValue("ARGENTINA");
	}
	
	
	public void setusername(String fusername) {
	Username.sendKeys(fusername);
	}
	public void setpassword(String fpassword) {
		Password.sendKeys(fpassword);
	}
	public void setconfirmpassword(String fconfirm) {
		Confirmpassword.sendKeys(fconfirm);
	}
	public void clickbutton () {
		button.click();
	}
	public void Check_text() {
		String assert_text=Text.getText();
	String TXT="Dear iteducation java,";
	if(assert_text.equals(TXT)) {
		System.out.println("your test is successfully");
	}
	}
	
		
		
		
}

