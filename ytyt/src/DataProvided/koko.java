package DataProvided;


	

	import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;

	public class koko { 
		
		WebDriver driver;
		By signin =By.xpath("//a[@class='login']");
		By mail=By.id("email");
		By password=By.id("passwd");
		By button=By.id("SubmitLogin");
		@BeforeClass
		public void beforeclass()
		{
			System.setProperty("webdriver.chrome.driver","C:\\lol2\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			
		}
		@Test (dataProvider ="hatdata")
		public void login (String email,String pass) {
			driver.findElement(signin).click();
			driver.findElement(mail).sendKeys(email);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(button).click();
			
		}
			@DataProvider (name="hatdata")
			public Object[][] getdata(){
			Object[][]data=new Object[2][2];
				
				data[0][0]="email1@email.com";
				data[0][1]="password1";		
				data[1][0]="email2@email.com";data[1][1]="password2";
				return data;
				
			
				
			}
		
	}



