package testNG;

import org.testng.annotations.Test;

public class Grouping {
	

public class Drivercarexmple {
	
	
	//priority the testcases example
	@Test(groups = {"moto"})
	public void startcar() {
		System.out.println("Start car");
		
	}
	@Test(groups = {"vivo"})
	public void Firstgear() {
		System.out.println("fristgear car");
		
	}
	@Test(groups = {"moto"})
	public void secondgear() {
		System.out.println("secnd car");
		
	}
	@Test(groups = {"apple"})
	public void thirdgear() {
		System.out.println("third car");
		
	}

}}
