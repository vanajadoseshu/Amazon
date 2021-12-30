package com.amazon.stepdefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.runner.Runner;

import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;

public class Amazon_Step {
public static WebDriver driver= Runner.driver;


@Given("Open chrome and browse the application to launch")
public void open_chrome_and_browse_the_application_to_launch() {
	driver.get("https://www.google.com/");
	driver.get("https://www.amazon.in/");
	
}
@When("User clicks on All")
public void user_clicks_on_all() {
	WebElement all = driver.findElement(By.id("nav-hamburger-menu"));
	all.click();
	
	
}
@When("User clicks on the womens fashion")
public void user_clicks_on_the_womens_fashion() {	
	WebElement wf = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
	wf.click();
	
}
@Then("opens western wear")
public void opens_western_wear() {
	
	System.out.println("go to western wear");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
@When("User clicks on western wear")
public void user_clicks_on_western_wear() {
	
	WebElement ww = driver.findElement(By.xpath("//a[contains(text(),'Western Wear')]"));	
	ww.click();
	
}
@When("clicks on trousers")
public void clicks_on_trousers()  {	
	WebElement tr= driver.findElement(By.xpath("//span[contains(text(),'Rainwear')]"));
	tr.click();	   
	
}
@Then("selects an item")
public void selects_an_item() {	
	
	
	 driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
	
	 Set<String> allID = driver.getWindowHandles();
	for (String id : allID) {
		String alltitle = driver.switchTo().window(id).getTitle();
		System.out.println(alltitle);		
	}
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	}	

@Then("Add item to wish list")
public void add_item_to_wish_list() {
	System.out.println("add selected item to wish list");
	
}
@When("User add selected item to wish list")
public void user_add_selected_item_to_wish_list() {
	
	 driver.findElement(By.name("submit.buy-now")).click();
	
}
@When("User clicks on view wish list")
public void user_clicks_on_view_wish_list() {
	WebElement vwl = driver.findElement(By.xpath("//*[text()='View Wish List']"));
	vwl.click();	
	
}
@When("User clicks on more options")
public void user_clicks_on_more_options() {
	WebElement mo = driver.findElement(By.id("overflow-menu-popover-trigger-I15N3R8LJDDXK3"));
	mo.click();
	
}
@Then("User selects delete from more options")
public void user_selects_delete_from_more_options() {
	WebElement del = driver.findElement(By.xpath("//body/div[@id='a-popover-1']/div[1]/div[1]/div[1]/div[1]/ul[1]/span[3]/li[1]/span[1]"));
	del.click();
}
}














   
		  

	




