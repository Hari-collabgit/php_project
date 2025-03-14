package Projectsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//php travels
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
	driver.manage().window().maximize();
	
	WebElement firstname= driver.findElement(By.className("first_name form-control"));
	firstname.sendKeys("Hari Krishnan");
	
	WebElement lastname= driver.findElement(By.className("last_name form-control"));
	lastname.sendKeys("S");
	
	WebElement number=driver.findElement(By.xpath("//*[@id=\"swup\"]/section[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/div[2]/div/input"));
	number.sendKeys("6382645679");
	
	WebElement  businessname= driver.findElement(By.className("company_name form-control"));
	businessname.sendKeys("Online");
	
	WebElement email=driver.findElement(By.name("email"));
	email.sendKeys("rainahk333@gmail.com");
	
	
	
	
	}

}
