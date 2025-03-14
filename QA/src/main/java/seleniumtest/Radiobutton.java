package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node01shq6mv3alaf0sbppwp0iezss8762270.node0");
		driver.manage().window().maximize();

		//click on any option
		WebElement checkinsafari=driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[3]"));
		checkinsafari.click();

		/*check checked and unchecked
		WebElement uncheckedstatus=driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[2]"));
		WebElement checkedstatus=driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/label"));

		boolean status1=uncheckedstatus.isSelected();
		boolean status2=checkedstatus.isSelected();

		System.out.println(status1);
		System.out.println(status2);*/


		//selecting the other one which is not selected
		WebElement agegroup=driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]"));
		agegroup.click();
	}

}
