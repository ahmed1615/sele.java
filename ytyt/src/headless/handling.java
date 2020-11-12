    package headless;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		String tit=driver.getTitle();
		//System.out.println(tit);
		
		Set <String> s=driver.getWindowHandles();
		for(String i:s) {
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t+ i);
			if(t.contains("Frames & windows")) {
				driver.close();
			}
			
		}
		
		/*Set<String> id= driver.getWindowHandles();
		Iterator<String>it=id.iterator();
		
		String parentID= it.next();
		String childID=it.next();
		driver.switchTo().window(childID);	*/
		
		
	Set<String>id=driver.getWindowHandles();
	Iterator<String>it=id.iterator();
	String firstpage=it.next();
	String secondepage=it.next();
	driver.switchTo().window(secondepage);
	

	}

}
