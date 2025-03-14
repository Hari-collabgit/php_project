package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();

		//Click 
		WebElement click=driver.findElement(By.id("j_idt88:j_idt90"));
		click.click();

		//get xy position
		WebElement position=driver.findElement(By.id("j_idt88:j_idt94"));
		Point xyposition=position.getLocation();
		int xvalue=xyposition.getX();
		int yvalue=xyposition.getY();
		System.out.println("X position: "+ xvalue+"     Y position: "+ yvalue);

		//find the color
		WebElement color=driver.findElement(By.id("j_idt88:j_idt96"));
		String bgcolor=color.getCssValue("background");
		System.out.println(bgcolor);

		//find height and width
		WebElement sizebutton=driver.findElement(By.id("j_idt88:j_idt94"));
		int height=sizebutton.getSize().getHeight();
		int width=sizebutton.getSize().getWidth();
		System.out.println("Height is : "+height +"Width is : "+width);
	}

}
