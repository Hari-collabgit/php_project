package seleniumtest;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		/*WebElement from= driver.findElement(By.id("form:drag_content"));
		WebElement to= driver.findElement(By.id("form:drop_content"));
		
		Actions actions= new Actions(driver);
		
		actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		actions.dragAndDrop(from, to).build().perform();
		
		
		WebElement draganddrop=driver.findElement(By.className("ui-panel-content ui-widget-content"));
		actions.dragAndDrop(to, draganddrop).build().perform();*/
		
		//WebElement start=driver.findElement(By.id("form:j_idt119"));
		//start.click();
		
		
		//draga and drop list of elements
		List <WebElement> element=driver.findElements(By.xpath("//*[@id=\"form\"]/div/div[2]/div[2]/li"));//*[@id="form"]/div/div[2]/div[2]
	WebElement from=element.get(6);
	WebElement to=element.get(0);
	 
	Actions action=new Actions(driver);
	action.clickAndHold(from);
	action.moveToElement(to);
	action.release(to);
	action.build().perform();
	
	}

}
