package headless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\lol\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@class='analystic']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		String one=driver.switchTo().alert().getText();
		System.out.println(one);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		String seconde=driver.switchTo().alert().getText();
		System.out.println(seconde);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		String three=driver.switchTo().alert().getText();
		System.out.println(three);
		driver.switchTo().alert().sendKeys("ahmed");
		driver.switchTo().alert().accept();
		String ASSERT="Hello ahmed How are you today";
		String text3=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		System.out.println(text3);
		if(ASSERT.equals(text3)==true) {
			System.out.println("the test was passed");
		}
		

	}

}
