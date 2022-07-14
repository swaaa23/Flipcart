package com.flipkart;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePurchase {
	static WebDriver driver;
	static long start;
	
	@BeforeClass
	public static void browserLaunch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\eclipse\\seleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		System.out.println("browserLaunch");	
		
	}
	@AfterClass
	public static void browserQuit(){
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.quit();
				System.out.println("quit browser");
	}
	
	

	
	@Before
	public void startingTime(){		
		System.out.println("Before");
	 start =	System.currentTimeMillis();
	}
	
	@After
	public void endTime(){
	long end = System.currentTimeMillis();
	System.out.println("Time taken is :"+(end-start));	
}	
	
	

	@Test	
	public void methodA() throws Exception {
		WebElement cancel = driver.findElement(By.xpath("//*[text()='✕']"));
		cancel.click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("Popup handling");
		

		}
	
	@Test
	public void methodB() throws Exception {
	WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
	search.click();
	search.sendKeys("Apple iPhone 13 Pro");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(10000);
			System.out.println("Mobile searched");
		
		}
	
	@Test
	public void methodC() throws Exception {
		Thread.sleep(5000);
		WebElement apple = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		apple.click();
		System.out.println("phone selected");
		//String strText = driver.findElement(("//span[@class='B_NuCI')]").getText().toString());
		
		 /*File f = new File("C:\\Users\\HP\\Documents\\mobileTvpurchase.xlsx");
    	 Workbook wb = new XSSFWorkbook();
    	Sheet st = wb.createSheet("flipkart");
    	 Row rw =  st.createRow(1);
    	Cell cl = r.createCell(0);
    	 c.setCellValue(st);
    	 FileOutputStream f1 = new FileOutputStream(f);
    	 wb.write(f1);
    	 System.out.println("excel");
		WebElement  phone = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		 String  s1 = phone.getText();
		System.out.println(s1);
		 File f = new File("C:\\Users\\HP\\Documents\\mobileTvpurchase.xlsx");
   	 Workbook w = new XSSFWorkbook();
   	Sheet sh = w.createSheet("flipcart");
   	 Row r =  sh.createRow(7);
   	Cell c = r.createCell(0);
   	 c.setCellValue(s1);
   	 FileOutputStream f1 = new FileOutputStream(f);
   	 w.write(f1);*/
		}
	
	@Test
	public void methodD() throws Exception {
		 
			 Thread.sleep(5000);
	    	String parentwin= driver.getWindowHandle();
	    	  Set<String> allwindows = driver.getWindowHandles();
	    	  for (String x : allwindows) {
	    		if (!x.equals(parentwin)) {
	    			driver.switchTo().window(x);
	    			}}
	    			 Thread.sleep(5000);
		System.out.println("Window Handled");
		}
	@Test
	public void methodE() throws Exception{
		Thread.sleep(5000);
		TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\HP\\workspace\\eclipse\\JunitJuly\\Screenshots\\flipcart.png");
		FileUtils.copyFile(source,target);
	System.out.println("screenshotted");

		 }	 }
