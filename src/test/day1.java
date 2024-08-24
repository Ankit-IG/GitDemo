package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");//automation
		Assert.assertTrue(false);
	}

	@AfterSuite
	public void afsuite() {
		System.out.println("I am on no. last");
	}
	@Test
	public void secondTest()
	{
		System.out.println("bye");
	}
	//New code added by Indian guy
	@Test
	public void gitDemo()
	{
		System.out.println("bye");
		System.out.println("bye2");
		System.out.println("bye3");
	}
	
}
