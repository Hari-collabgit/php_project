package Datadrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crctusernamewrngpw {
	
	String [][] data= {
			{"Admin","admin"},
			{"Admin","admin"},
			{"Admin","admin"},
			{"Admin","admin"},
	};
	
	
	
	
	@DataProvider(name="logindata")
	public String[][] dataprovider() {
		return data;
		
		
		
	}
	
@Test(dataProvider = "logindata")
@Parameters({"user name","password"})
	public static void main(String[] args) {
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
