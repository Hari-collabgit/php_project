package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class Assertions {
	
	
	String name="Agni";
	@Test
	public void name() {
		/*if(name.equals(name)) {
			System.out.println("The name is equal");
		}
		else {
			System.out.println("Not equal");
		}
		
	}*/
	
	Assert.assertNotEquals(name, "Agni");

}
}