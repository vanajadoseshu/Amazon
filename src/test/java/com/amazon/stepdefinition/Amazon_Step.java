package com.amazon.stepdefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.amazon.runner.Runner;
import io.cucumber.java.en.*;

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
	System.out.println("user opens western wear");
}
@When("User clicks on western wear")
public void user_clicks_on_western_wear() throws Exception {
	WebElement ww = driver.findElement(By.xpath("//a[text()='Western Wear']"));	
	ww.click();
	Thread.sleep(2000);
}
@When("clicks on trousers")
public void clicks_on_trousers()  {	
	WebElement rw = driver.findElement(By.xpath("//span[contains(text(),'Winterwear')]"));
	rw.click();
}
@Then("selects an item")
public void selects_an_item() {	
WebElement ww1 = driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[1]/div[1]/a[1]/div[1]/div[1]"));
ww1.click();

}	
@Then("Add item to wish list")
public void add_item_to_wish_list() {
	System.out.println("wish list item");
	
}
@When("User add selected item to wish list")
public void user_add_selected_item_to_wish_list(){
		
WebElement awl = driver.findElement(By.xpath("//input[contains(@value,'Add to Wish List')]"));
Actions at=new Actions(driver);
at.moveToElement(awl).perform();

JavascriptExecutor je=(JavascriptExecutor) driver;
je.executeScript("argument[0].click()", awl);
     
}
@When("User clicks on view wish list")
public void user_clicks_on_view_wish_list() {
	WebElement wl = driver.findElement(By.xpath("//span[contains(text(),'View Wish List')]"));
	wl.click();
	
}

@When("User clicks on more options")
public void user_clicks_on_more_options() {
	WebElement mo = driver.findElement(By.id("overflow-menu-popover-trigger-I15N3R8LJDDXK3"));
	mo.click();
	
}
@Then("User selects delete from more options")
public void user_selects_delete_from_more_options() {
	WebElement del = driver.findElement(By.id("overflow-menu-popover-trigger-I15N3R8LJDDXK3"));
	del.click();
}
}














   
		  

	




