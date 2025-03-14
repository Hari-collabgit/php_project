package testNG;

import org.testng.annotations.Test;

public class Skiptestcases {
	
	//priority the testcases example
		@Test(priority=0)
		public void startcar() {
			System.out.println("Start car");
			
		}
		@Test(priority=1,enabled=false)
		public void Firstgear() {
			System.out.println("fristgear car");
			
		}
		@Test(priority=2)
		public void secondgear() {
			System.out.println("secnd car");
			
		}
		@Test(priority=3)
		public void thirdgear() {
			System.out.println("third car");
			
		}

}
