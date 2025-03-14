package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		
		//selecting the option in dropdown
		WebElement tool=driver.findElement(By.className("ui-selectonemenu"));
		Select select=new Select(tool);
		//select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByVisibleText("Playwright");
		
		//using sendkeys
		tool.sendKeys("Cypress");
		
		//selecting the preffered country
		/*WebElement country=driver.findElement(By.id("j_idt87:country"));
		Select appointed=new Select(country);
		Thread.sleep(5000);
		appointed.selectByVisibleText("Brazil");
		
		country.sendKeys("brazil");*/
		
		//multiple select
		WebElement multipleselect=driver.findElement(By.className("ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-left"));
		
		Select multi=new Select(multipleselect);
		multi.selectByVisibleText("AWS");
		multi.selectByVisibleText("Appium");
		
		
	}
 
}
