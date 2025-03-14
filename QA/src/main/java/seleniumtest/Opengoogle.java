package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Opengoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/?affid=rohanpouri&affExtParam1=ENKR20250207A1319649447&affExtParam2=4055343&gad_source=1&gclid=Cj0KCQiA_NC9BhCkARIsABSnSTb9rrXe-MqAQKfOSMYgaKDSTLVD_4bj8cgnilGPSE-eYcUWHGq5NCkaAlAqEALw_wcB");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.className("Pke_EE"));
		search.sendKeys("iphone 15"+Keys.ENTER);
		//search.submit();
		driver.findElement(By.className("KzDlHZ")).click();
		driver.findElement(By.className("QqFHMw vslbG+ In9uk2")).click();
		driver.findElement(By.className("QqFHMw vslbG+ _3Yl67G FMWyoY")).click();
		//driver.close();
	}
 
}
