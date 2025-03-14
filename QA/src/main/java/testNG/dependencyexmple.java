package testNG;

import org.testng.annotations.Test;

public class dependencyexmple {

	@Test
	public void school() {
		System.out.println("10th completed");
		
	}
	@Test(dependsOnMethods = "school")
public void highschool() {
		System.out.println("12th completed");
		
	}
	@Test(dependsOnMethods = "highschool")
public void college() {
		System.out.println("Joined college");
	
}
}
