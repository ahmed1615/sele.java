package automationpractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class locators {
	WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement Login;
	@FindBy(id="email_create")
	private WebElement CreateEmail;
	@FindBy(name="SubmitCreate")
	private WebElement Button;
	@FindBy(id="id_gender1")
	private WebElement Male_Radio;
	@FindBy(name="customer_firstname")
	private WebElement C_Firstname;
	@FindBy(name="customer_lastname")
	private WebElement c_Lastname;
	@FindBy(id="email")
	private WebElement Email_1;
	@FindBy(name="passwd")
	private WebElement Password;
	@FindBy(id="days")
	private WebElement Day;
	@FindBy(id="months")
	private WebElement Month;
	@FindBy(id="years")
	private WebElement Year;
	@FindBy(id="newsletter")
	private WebElement Newsletter;
	@FindBy(id="firstname")
	private WebElement Firstname;
	@FindBy(id="lastname")
	private WebElement Lastname;
	@FindBy(id="company")
	private WebElement Company;
	@FindBy(id="address1")
	private WebElement Address;
	@FindBy(id="address2")
	private WebElement Address_2;
	@FindBy(id="city")
	private WebElement City;
	@FindBy(id="id_state")
	private WebElement State;
	@FindBy(id="postcode")
	private WebElement Postcode;
	@FindBy(id="id_country")
	private WebElement Country;
	@FindBy(xpath="//*[@id='other']")
	private WebElement W_Text;
	@FindBy(id="phone")
	private WebElement Home_Phone;
	@FindBy(id="phone_mobile")
	private WebElement Mobile_Phone;
	@FindBy(id="alias")
	private WebElement Alias;
	@FindBy(id="submitAccount")
	private WebElement Register;
	
	
	public  locators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Click_login() {
		Login.click();
	}
	public void Setemail(String fmail) {
		CreateEmail.sendKeys(fmail);
	}
	public void Click_B() {
		if(Button.isEnabled()&& Button.isDisplayed()==true ) {
		Button.click();
	}
	}
	public void Choose_male() {
		if(Male_Radio.isSelected()==false) {
			Male_Radio.click();
		}
	}
	public void Set_cfirstname(String fcfirst) {
		C_Firstname.sendKeys(fcfirst);
	}
	public void Set_clastname(String fclast) {
		c_Lastname.sendKeys(fclast);
	}
	public void Click_email() {
		Email_1.click();
	}
	public void Write_pass(String PASS) {
		Password.sendKeys(PASS);
	}
	
	public void Select_day() {
		Select value_day=new Select(Day);
		value_day.selectByValue("20");
				
	}
	public void Select_month() {
		Select value_day=new Select(Month);
		value_day.selectByValue("5");
	}
	
	
	public void Select_year() {
	Select value_day=new Select(Year);
	value_day.selectByValue("1990");
	}
	public void Click_New() {
		Newsletter.click();
	}
	public void Setfirstname(String FFF) {
		Firstname.clear();
		Firstname.sendKeys(FFF);
	}
	public void Setlastname(String LLL) {
		Lastname.clear();
		Lastname.sendKeys(LLL);
	}
	public void SetCompany(String CCC) {
		Company.sendKeys(CCC);
	}
	public void Setaddress(String AAA) {
		Address.sendKeys(AAA);
	}
	public void Setaddress2(String ASAS) {
		Address_2.sendKeys(ASAS);
	}
	public void Setcity(String CICI) {
		City.sendKeys(CICI);
	}
	public void Select_state() {
		Select s=new Select(State);
		s.selectByValue("32");
	}
	public void SetZip(String ZIP) {
		 Postcode.sendKeys(ZIP);
	}
	public void WriteText(String TXT) {
		W_Text.sendKeys(TXT);
	}
	public void Write_homephone(String PH) {
		Home_Phone.sendKeys(PH);
	}
	public void Write_mobilephone(String MH)
	{
		Mobile_Phone.sendKeys(MH);
	}
	public void Write_alis(String AL)
	{
		Alias.clear();
		Alias.sendKeys(AL);
	}
	public void Click_finsih() {
		Register.click();
	}
	
	
	
}
