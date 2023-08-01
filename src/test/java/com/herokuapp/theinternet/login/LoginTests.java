package com.herokuapp.theinternet.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests {
	
	@Test
	public void positiveLoginTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		
		
//		driver.quit();
	}

}
