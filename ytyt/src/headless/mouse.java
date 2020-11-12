package headless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action=new Actions(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	WebElement admin=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
	action.moveToElement(admin).build().perform();
	WebElement userM=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
	action.moveToElement(userM).build().perform();
	WebElement user=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
	action.moveToElement(user).click().build().perform();
	//action.moveToElement(admin).moveToElement(userM).moveToElement(user).click().build().perform();
	//right click
	
	driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement button=
			driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(button).build().perform();
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-quit']")).click();
		driver.switchTo().alert().accept();
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement roma=driver.findElement(By.id("box6"));
		WebElement italia=driver.findElement(By.id("box106"));
		action.dragAndDrop(roma, italia).build().perform();
		
		//slider 
		driver.navigate().to("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//*[@id=\'slider\']/span"));
		action.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
		driver.navigate().to("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement rez=driver.findElement(By.xpath("//*[@id=\'resizable\']/div[3]"));
		action.moveToElement(rez).dragAndDropBy(rez,100, 50).build().perform();
		Thread.sleep(3000);
		//for drop and drag
		//http://www.dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
	}
}
