package Projectsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		
		//WebElement email=driver.findElement(By.id("email"));
		//email.sendKeys("rainahk333@gmail.com");

		/*WebElement signup=driver.findElement(By.id("signup"));
		signup.click();
		
		WebElement fn=driver.findElement(By.id("firstName"));
		fn.sendKeys("Hari");
		
		WebElement  ln=driver.findElement(By.id("lastName"));
		ln.sendKeys("Krishnan");*/
		
		WebElement  email=driver.findElement(By.id("email"));
		email.sendKeys("rainahk333@gmail.com");
		
		WebElement  passwrd=driver.findElement(By.id("password"));
		passwrd.sendKeys("H@r!@kr!shn@n6");
		
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();
		
		WebElement addcontact=driver.findElement(By.id("add-contact"));
		addcontact.click();
		
		
		
	}

}
