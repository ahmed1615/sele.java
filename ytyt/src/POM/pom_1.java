package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom_1 {
	public static void main(String[]args) {
		Googlesearch();

}	
	public static void Googlesearch() {
		System.setProperty("webdriver.chrome.driver","C:\\lol2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Atumation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test completed successfuley");
			
		
		
		
		
	}
}