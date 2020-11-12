package headless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/FileDownload.html");
	driver.findElement(By.id("textbox")).sendKeys("testing");
	driver.findElement(By.id("createTxt")).click();
	driver.findElement(By.id("link-to-download")).click();

	}

}
