package seleniumtest;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*WebDriver driver= new ChromeDriver();
	driver.get("https://www.leafground.com/link.xhtml;jsessionid=node06z4dik5y2knz16u8c97bxqqw38756511.node0");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Go to Dashboard")).click();*/
	
	
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("password");
		
		WebElement login=driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
login.click();
	}
	}


