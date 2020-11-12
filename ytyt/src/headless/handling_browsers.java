package headless;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_browsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	String tit=driver.getTitle();
	System.out.println(tit);
	//Set<String>ids=driver.getWindowHandles();
	//for(String i:ids) {
	//String t=	driver.switchTo().window(i).getTitle();
	//System.out.println(i); //to get the id of the pages
		//System.out.println(t); //to get the title of the pages 
		//if(t.equals("Frames & windows")) {
			//driver.close();
		//}
		

	Set<String>id=driver.getWindowHandles();
	Iterator<String>it=id.iterator();
	String firstpage=it.next();
	String secondepage=it.next();
	driver.switchTo().window(secondepage);
	driver.findElement(By.id("gsc-i-id1")).sendKeys("3ala allah");
	driver.switchTo().window(firstpage);
	driver.findElement(By.linkText("Widgets")).click();
	
	
		
	}
	
	
	
		

	}


