package maven.seleniumproj;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_annotations {
	
	@AfterMethod
	void aftermethod() {
		System.out.println("After method");
	}
	
	@BeforeMethod
	void beforemwthod()
	{
		System.out.println("Before method");
	}
	
	@AfterClass
	void afterclass()
	{
		System.out.println("After class");
	}
	
	@BeforeClass
	void beforeclass()
	{
		System.out.println("Before class");
	}
	
	@AfterTest
	void aftertest()
	{
		System.out.println("After test");
	}
	
	@BeforeTest
	void beforetest()
	{
		System.out.println("Before test");
	}
	
	@AfterSuite
	void aftersuite()
	{
		System.out.println("After testsuite");
	}
	
	@BeforeSuite
	void beforesuite()
	{
		System.out.println("before testsuite");
	}
	@Test
	void test()
	{
		System.out.println("print this");
	}
}
