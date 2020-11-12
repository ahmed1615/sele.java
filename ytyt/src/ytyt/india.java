package ytyt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class india {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	String title="Welcome: Mercury Tours";
	String actual_title=    driver.getTitle();
	if(title.equals(actual_title)==true) {
		System.out.println("it is the same title");
	}
	else {
		System.out.println("it is not the same title");
	}
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("userName")).sendKeys("vyxu@mailinator.com");
		driver.findElement(By.name("password")).sendKeys("Pa$$w0rd!");
		String title1="Login: Mercury Tours";
		String title2="Login: Mercury Tours";
		if(title1.equals(title2)==true) {
			System.out.println("it is the same titile (the seconde page)");
		}
		else {
			System.out.println("this is not the same title(the seconde page)");
		}
		
		driver.close();

	}

}
