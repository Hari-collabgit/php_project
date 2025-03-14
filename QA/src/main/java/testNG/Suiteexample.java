package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Suiteexample {
	
	@Test
	public void opengoogle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}
	@Test
	public void openfirefox() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}
	@Test
	public void openedge() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}
	

}
