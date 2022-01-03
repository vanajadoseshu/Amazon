package com.amazon.pom;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browsername)
	{
		
		try {
			if(browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\eclipse-workspace\\Selenium_Test\\Driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
			}
			else if(browsername.equalsIgnoreCase("Msedge")){
				System.setProperty("webdiver.msedge.driver", "C:\\Users\\vinot\\eclipse-workspace\\Selenium_Test\\Driver\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();				
				
			}
			else {
				System.out.println("invalid browser name");
			}
			driver.manage().window().maximize();
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		return driver;
	}
	//send keys
	public static void sendKeys(WebElement element,String value) {
		element.sendKeys(value);
	}
//url
	public static void getUrl(String url) {
		try {
			driver.get(url);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	//click
		public static void click(WebElement element) {
			Actions act=new Actions(driver);
			act.click(element).perform();
			
		}
		
		//double click
		public static void doubleclick(WebElement element1) {
			Actions act1=new Actions(driver);
			act1.doubleClick(element1).perform();
			
		}
		//context click
		public static void contextclick(WebElement element2) {
			Actions act2= new Actions(driver);
			act2.doubleClick().perform();
			
		}
		
		//dropdown
		public static void dropDown(WebElement element3,String options,String value)
		{
			Select s=new Select(element3);
			{
				if(options.equalsIgnoreCase("value")) {		
					s.selectByValue(value);
				}
				else if(options.equalsIgnoreCase("visibletext"))
				{
					s.selectByVisibleText(value);							
					
				}
				
				else if(options.equalsIgnoreCase("index")){
				s.selectByIndex(Integer.parseInt(value));
					
				}
				else {
					System.out.println("invalid options") ;
				}		
											
	}
		}
	//keydown
			public static void keyDown() throws AWTException {
			Robot	n= new Robot();
			n.keyPress(KeyEvent.VK_DOWN);
			n.keyRelease(KeyEvent.VK_DOWN);
			}
	//window delay
			public static void windowDelay() {
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			}
			
	//new url
			public static void getNewUrl(String NewUrl) {
				driver.navigate().to(NewUrl);
			}
			public static void backToPage() {
				driver.navigate().back();
				
			}
			public static void forward()
			{
				driver.navigate().forward();
			}
			public static void reloadpage()
			{
				driver.navigate().refresh();
			}
			public static void id(String value) {
				driver.findElement(By.id(value));
			}
				public static void name(String value) {
					driver.findElement(By.name(value));
				}
				public static void classname(String value) {
					driver.findElement(By.className(value));
				}
				public static void xpath(String value) {
				driver.findElement(By.xpath(value));
			}
		}			

