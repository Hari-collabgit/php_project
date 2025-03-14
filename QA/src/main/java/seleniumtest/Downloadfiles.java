package seleniumtest;

import java.io.File;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0wgbf98rjsp2pxc7ssnte8ccu8780318.node0");
		driver.manage().window().maximize();

		//download a file
		WebElement dwnld= driver.findElement(By.linkText("Download"));
		dwnld.click();

		Thread.sleep(3000);

		File filelocation=new File("\"C:\\Users\\Nicksan\\Downloads\\TestLeaf Logo.png\"");
		File[]	totalfiles=filelocation.listFiles();

		for (File file : totalfiles) {
			if(file.getName().equals("Download")) {
				System.out.println("The file is downloaded");
				break;

			
				//upload file

			}

		}

	}

}
