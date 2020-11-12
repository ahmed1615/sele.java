package ytyt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		//headless browser testing
		
	}

}
