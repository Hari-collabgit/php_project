package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		//number of windows opened
		WebElement windowopened= driver.findElement(By.id("j_idt88:j_idt91"));
		windowopened.click();
		
		int size=driver.getWindowHandles().size();
		System.out.println(size);
		
		//wait 
		WebElement wait=driver.findElement(By.id("j_idt88:j_idt95"));
		wait.click();
	}

}
