package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node06z4dik5y2knz16u8c97bxqqw38756511.node0");
		driver.manage().window().maximize();

		WebElement Name= driver.findElement(By.id("j_idt88:name"));
		Name.sendKeys("Hari Krishnan S");

		WebElement append= driver.findElement(By.id("j_idt88:j_idt91"));
		append.sendKeys(" Super Kings");

		WebElement disabled=driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
		boolean disable=disabled.isEnabled();
		System.out.println(disable);


		WebElement cleartext= driver.findElement(By.name("j_idt88:j_idt95"));
		cleartext.clear();

		WebElement emailtab=driver.findElement(By.id("j_idt88:j_idt99"));
		emailtab.sendKeys("hari@gamil.com",Keys.TAB);

		WebElement aboutmyself=driver.findElement(By.id("j_idt88:j_idt101"));
		aboutmyself.sendKeys("My self hari Im from coimbatore");

		WebElement age=driver.findElement(By.name("j_idt106:thisform:age"));
		age.sendKeys(Keys.ENTER);

		WebElement clickoption=driver.findElement(By.className("ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-left"));
		clickoption.sendKeys("Hari");


	
	 
	}

}
