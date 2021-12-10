package org.sample;

import org.junit.BeforeClass;
import org.lib.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends LibGlobal {
	
	@BeforeClass
	
	private void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();	
		
		driver.get("https://adactinhotelapp.com/");
		
		
		
		
		
		
		
		
		
	}

}
