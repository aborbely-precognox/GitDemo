package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last.");
	}
	
	@Test
	public void Demo() {
			System.out.println("hello");
			System.out.println("hello2");
			System.out.println("hello3");
			System.out.println("hello4");
			Assert.assertTrue(false);
	}
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am the number 1 from last.");
	}
	@Test
	public void SecondTest() {
		System.out.println("hellooooo");
}

}
