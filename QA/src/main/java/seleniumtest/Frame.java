package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		//click and getting text
		driver.switchTo().frame(0);
		WebElement clickme=driver.findElement(By.id("Click"));
		clickme.click();
		
		String text=driver.findElement(By.id("Click")).getText();
        System.out.println(text);
        driver.switchTo().defaultContent();
	
	//Click Me (Inside Nested frame)
       /* driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        WebElement nested=driver.findElement(By.id("Click"));
        nested.click();
        
        driver.switchTo().defaultContent();*/
        
       List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
       totalframes.size();
       System.out.println(totalframes);

	}
	

}
