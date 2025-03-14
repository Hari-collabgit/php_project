package seleniumtest;

//import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0dhxful1ptqkg1m92m1uqnirz8758794.node0");
		driver.manage().window().maximize();
	
		//alert click ok
		WebElement clickok=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		clickok.click();
		Alert alert= driver.switchTo().alert();
		Thread.sleep(3000);
	alert.accept();
	
	//Click on cancel
	WebElement clickcancel=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
	clickcancel.click();
	Alert cancel= driver.switchTo().alert();
	cancel.dismiss();
	
	//prompt adding text 
	WebElement addtext=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
	addtext.click();
	Alert prompt= driver.switchTo().alert();
	Thread.sleep(4000);
	prompt.sendKeys("Adding prompt");
	Thread.sleep(4000);
	prompt.accept();
	
	}

}
