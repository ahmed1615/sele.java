package DataProvided;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Excel {
	
	
	
	@Test
	public void login(String username,String password) {
			System.setProperty("webdriver.chrome.driver","C:\\lol2\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://classic.freecrm.com/index.html?e=1");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}
	@DataProvider(name="getdata")
	public Object[][]getData() throws Throwable{
		return Readdata("C:\\excelSelenuim\\tt.xlsx");
	}
	public Object [][]Readdata(String filepath) throws Throwable{
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		Iterator<Row>itr=sheet.iterator();
		Object[][]data=new Object[sheet.getLastRowNum()][3];
		for(int i=1;i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
			Cell cell=sheet.getRow(i).getCell(j);
			
			
		}
		
		
		
		
		
		
	
	}
		return getData();
	
	}
}
