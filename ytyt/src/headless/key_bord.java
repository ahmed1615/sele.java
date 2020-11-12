package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class key_bord {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");

	}

}
