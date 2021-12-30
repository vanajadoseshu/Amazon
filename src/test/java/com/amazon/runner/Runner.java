package com.amazon.runner;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\amazon",glue = "com\\amazon\\stepdefinition")

public class Runner {
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
}
}


