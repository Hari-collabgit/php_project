package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node01vkxbw4v5wqbdunywpb1yuiua8762883.node0");
		driver.manage().window().maximize();
		
		//Basic checkin
		WebElement bascicheck=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		bascicheck.click();
		
		
		//Verify if check box is disabled
		WebElement disabled=driver.findElement(By.id("j_idt87:j_idt102"));
		boolean dis=disabled.isEnabled();
		System.out.println(dis);
		
		//Toggle Switch
		WebElement toogle=driver.findElement(By.className("ui-toggleswitch-slider"));
		toogle.click();
		
		//check in should be checked out and checked outshould be checked in
		WebElement firstelement=driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]"));
		if(firstelement.isSelected()) {
			firstelement.click();
		}
		
		WebElement secondelement=driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div/div[2]"));
		if(secondelement.isSelected()) {
			secondelement.click();
		}
		 
	}

}
